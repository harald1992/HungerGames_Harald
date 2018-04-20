package com.capgemini.Models;

import java.util.ArrayList;
import java.util.List;

public class ContestantList {


    //Public static omdat ik de lijst overal will accessen en over alle .java files dezelfde waarde moet blijven
    //niet dat waardes in een lijst bijv 10 is in ContestantList.java en 5 in ArenaController
    public static List<Contestant> contestantList = new ArrayList<>();

        //generate 18 DistrictContestants
      ///  DistrictContestant districtContestant1 = new DistrictContestant(true, "Man", 1,1,5,1,0);
            //generate 6 CareerContestants

    public void fillContestantList() {

        // Build 18 DistrictContesters
        for (int i = 0; i < 18; i++) {
            DistrictContestant districtContestant = new DistrictContestant("District", true, "Man", 1, 1, 5, 1, 0);
            contestantList.add(districtContestant);
        }
        for (int i = 0; i < 6; i++) {
            CareerContestant careerContestant = new CareerContestant("Career", true, "Man", 1, 1, 5, 1, 0);
            contestantList.add(careerContestant);
        }
        printContestantList();
    }


    public void printContestantList(){
        int indexNumber = 1;

        for(Contestant contestant : contestantList) {

            System.out.println("-------------------------------\n     Contestant " + indexNumber + ": " + contestant.getContestantType() + "\n------------------------------- ");
            System.out.println("Gender: " + contestant.getGender());
            System.out.println("Attack: " +contestant.getAttack());
            System.out.println("Defence: " +contestant.getDefence());
            System.out.println("HP: " +contestant.getHp());
            System.out.println("Level: " +contestant.getLevel());
            System.out.println("Bonus From Items: " +contestant.getAmountOfBonusFromItems());
            System.out.println();
            indexNumber++;
        }

    }


}
