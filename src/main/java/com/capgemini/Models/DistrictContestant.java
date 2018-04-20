package com.capgemini.Models;

public class DistrictContestant extends Contestant {

    public DistrictContestant(String contestantType, boolean isAlive, String gender, int attack, int defence, int hp, int level, int amountOfBonusFromItems) {
        //DistrictContesters gain extra defence from Drive to survive
        super(contestantType, isAlive, gender, attack, defence+1, hp, level, amountOfBonusFromItems);
    }


}
