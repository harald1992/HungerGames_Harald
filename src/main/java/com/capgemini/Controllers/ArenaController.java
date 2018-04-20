package com.capgemini.Controllers;
import com.capgemini.Models.Contestant;
//Mogelijk nog implementeren later : //import java.util.Collections; //  Collections.shuffle(contestantList);
import java.util.Random;
import java.util.Scanner;

import static com.capgemini.Models.ContestantList.contestantList;

public class ArenaController {


    Random random = new Random();
    Scanner scanner = new Scanner(System.in);


    //New Day induced a new battle with possible chances of battling. Is someone dies it will be removed
    public void newDay() {
        System.out.println("    New Day New Battles \n-------------- \n press enter for result");
        scanner.nextLine();

        //Choose which contesters to battle   (battling contesters called battlers
        int maximumOfConstantList = contestantList.size();
        int indexOfBattler1 = (random.nextInt(maximumOfConstantList));
        int indexOfBattler2 = (random.nextInt(maximumOfConstantList));

        if (indexOfBattler1 != indexOfBattler2) {                 //To prevent contesters to battle against themselves
            System.out.println("Contester " + indexOfBattler1 + " Found Contester " + indexOfBattler2);
            Contestant battler1 = contestantList.get(indexOfBattler1);
            Contestant battler2 = contestantList.get(indexOfBattler1);

            //Determine which battler wins   -> make function "determineLoser" later
            int strengthBattler1 = getStrength(battler1);
            int strengthBattler2 = getStrength(battler2);

            if (strengthBattler1 < strengthBattler2) {
                System.out.println("Contestant" + indexOfBattler1 + "was weaker and died horribly");
                contestantList.remove(indexOfBattler1);
            } else if (strengthBattler1>strengthBattler2) {
                System.out.println("Contestant" + indexOfBattler2 + "was weaker and died miserably");
            }
            else {
                     int loser = random.nextInt(1);
                    if (loser==0) {
                        contestantList.remove(indexOfBattler1);
                        System.out.println("Both contestants had a very tough fight and " + indexOfBattler1 + " Died");
                    }
                    else {
                        contestantList.remove(indexOfBattler2);
                        System.out.println("Both contestants had a very tough fight and " + indexOfBattler2 + " Died");

                    }
            }
        }
        System.out.println("Press enter for continuation");
        scanner.nextLine();
    }

    public int getStrength(Contestant battler) {
        int strengthContester1;
        strengthContester1 = battler.getAttack() + battler.getDefence() + battler.getHp() + battler.getLevel() + battler.getAmountOfBonusFromItems();
        System.out.println("Contester 1 Battle Strength = " + strengthContester1);
        return strengthContester1;
    }
}


// int StrengthContester1 =

//             contestantList.remove(1);
//     battlingContester2 = contestantList.remove(2);

//Battle Subject 1 vs Subject 2
//Determine strength