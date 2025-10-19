// Deal or No Deal 


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // for user input lol

        // array of case values (index 0 empty so numbers match)
        int[] allCases = new int[27]; // 0..26 (we use 1..26)
        allCases[1] = 1;
        allCases[2] = 5;
        allCases[3] = 10;
        allCases[4] = 25;
        allCases[5] = 50;
        allCases[6] = 75;
        allCases[7] = 100;
        allCases[8] = 200;
        allCases[9] = 300;
        allCases[10] = 400;
        allCases[11] = 500;
        allCases[12] = 750;
        allCases[13] = 1000;
        allCases[14] = 5000;
        allCases[15] = 10000;
        allCases[16] = 25000;
        allCases[17] = 50000;
        allCases[18] = 75000;
        allCases[19] = 100000;
        allCases[20] = 200000;
        allCases[21] = 300000;
        allCases[22] = 400000;
        allCases[23] = 500000;
        allCases[24] = 750000;
        allCases[25] = 1000000;
        allCases[26] = 1000000; // keep your original last value for case #26

        // this array just tracks if a case was opened (true = opened)
        boolean[] caseOpened = new boolean[27]; // all false by default

        // how many cases to open each round before banker offre
        int[] roundList = {6,5,4,3,2,1,1,1};

        System.out.println("=== DEAL OR NO DEAL ===");
        System.out.println("Pick a case to keep (1-26)!! this one stays till the end");

        int myCase = 0; // the case the player keeps
        while(true){
            int pick = scan.nextInt();
            // check if number makes sense (1-26 and not opened)
            if(pick >= 1 && pick <= 26 && !caseOpened[pick]){
                myCase = pick;
                break; // we good
            } else {
                System.out.println("pick a valid one (1-26 not opened)");
            }
        }

        System.out.println("You’re holding case #" + myCase);
        System.out.println("(don’t open this until the end!!!)");

        boolean tookDeal = false; // keeps track if player accepted a deal
        int bankOffer = 0; // last banker offer amount
        int roundNum = 0; // which round we’re on (starts at 0)

        // main game loop for rounds
        while(roundNum < roundList.length){
            // count how many unopened cases are left (not including myCase))
            int stillThere = 0;
            for(int i=1;i<=26;i++){
                if(!caseOpened[i] && i != myCase){
                    stillThere++;
                }
            }
            if(stillThere == 0) break; // nothing left to open, end it

            int toOpen = roundList[roundNum];
            // if not enough cases left, just open all that remain
            if(toOpen > stillThere){
                toOpen = stillThere;
            }

            int openNow = 0; // how many opened this round
            while(openNow < toOpen){
                // show which cases still unopened (so user knows what’s left)
                System.out.print("Unopened: ");
                for(int i=1;i<=26;i++){
                    if(!caseOpened[i] && i != myCase){
                        System.out.print("#"+i+" ");
                    }
                }
                System.out.println(" | ur kept: #"+myCase);

                System.out.println("Pick a case to open:");
                int openPick = scan.nextInt();

                // check if the pick makes sense
                if(openPick >= 1 && openPick <= 26 && !caseOpened[openPick] && openPick != myCase){
                    System.out.println("Case #"+openPick+" had $"+allCases[openPick]);
                    caseOpened[openPick] = true; // mark as opened
                    openNow++; // count it
                } else {
                    System.out.println("Invalid one </3 try again pls");
                }
            }

            // after some cases, banker gives offer
            int left = 0;
            for(int i=1;i<=26;i++){
                if(!caseOpened[i] && i != myCase){
                    left++;
                }
            }

            if(left >= 1){
                // banker offer is just avg of all unopened case values (including kept)
                int sum = 0;
                int count = 0;
                for(int i=1;i<=26;i++){
                    if(!caseOpened[i]){
                        sum = sum + allCases[i];
                        count++;
                    }
                }
                bankOffer = sum / count; // lazy average lol
                System.out.println("BANKER CALLS 📞");
                System.out.println("He offers: $" + bankOffer);
                System.out.println("Type 1 for DEAL or 2 for NO DEAL");

                int ans = scan.nextInt();
                // force user to pick 1 or 2 or it loops forever 
                while(ans != 1 && ans != 2){
                    System.out.println("uhh 1 or 2 pls:");
                    ans = scan.nextInt();
                }
                if(ans == 1){
                    tookDeal = true;
                    System.out.println("You took the deal for $" + bankOffer + "!! ");
                    break; // end game early
                } else {
                    System.out.println("NO DEALLL let’s keep going");
                }
            }

            // if only one case left, move to last round
            int rem = 0;
            for(int i=1;i<=26;i++){
                if(!caseOpened[i] && i != myCase){
                    rem++;
                }
            }
            if(rem == 1) break;

            roundNum++; // go to next round
        }

        // if player didn’t take deal, play till the end
        if(!tookDeal){
            while(true){
                // count how many still unopened (not myCase)
                int remaining = 0;
                for(int i=1;i<=26;i++){
                    if(!caseOpened[i] && i != myCase){
                        remaining++;
                    }
                }
                // stop when only one left
                if(remaining <= 1) break;

                // print current unopened cases
                System.out.print("Still unopened: ");
                for(int i=1;i<=26;i++){
                    if(!caseOpened[i] && i != myCase){
                        System.out.print("#"+i+" ");
                    }
                }
                System.out.println(" | kept: #"+myCase);
                System.out.println("Pick one to open:");
                int openCase = scan.nextInt();

                if(openCase>=1 && openCase<=26 && openCase!=myCase && !caseOpened[openCase]){
                    System.out.println("Case #"+openCase+" had $" + allCases[openCase]);
                    caseOpened[openCase] = true;
                } else {
                    System.out.println("try again T-T (pls)");
                }
            }

            // find last unopened case besides the kept one
            int lastCase = -1;
            for(int i=1;i<=26;i++){
                if(!caseOpened[i] && i != myCase){
                    lastCase = i;
                }
            }

            // final dramatic part lol
            System.out.println("LAST ROUND 😬");
            System.out.println("Your kept case: #" + myCase);
            System.out.println("Other case: #" + lastCase);
            System.out.println("Type 1 to KEEP or 2 to SWITCH (good luck 😭)");
            int choice = scan.nextInt();
            while(choice != 1 && choice != 2){
                System.out.println("pls type 1 or 2:");
                choice = scan.nextInt();
            }

            // figure out which case they end up with
            int finalCase;
            if(choice == 1){
                finalCase = myCase;
            } else {
                finalCase = lastCase;
            }

            // reveal prize 
            int prize = allCases[finalCase];
            System.out.println("YOU WON $" + prize + "!!! 🎉");
            int other;
            if(finalCase == myCase){
                other = lastCase;
            } else {
                other = myCase;
            }
            System.out.println("Other case had $" + allCases[other]);
        } else {
            // they took deal so just reveal what was in their case
            System.out.println("(just curious) your kept case had $" + allCases[myCase]);
        }

        System.out.println("=== thx for playing :) ===");
        System.out.println("this took me way too long but it works so yay 🫶");
        scan.close();
    }
}
