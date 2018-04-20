package com.capgemini.Models;

public class CareerContestant extends Contestant {


    public CareerContestant(boolean isAlive, String gender, int attack, int defence, int hp, int level, int amountOfBonusFromItems) {
        //CareerContesters start with extra level from training
        //CareerContesters start with a bonus from battleItem
        super(isAlive, gender, attack, defence, hp, level+1, amountOfBonusFromItems+1);
    }
}

