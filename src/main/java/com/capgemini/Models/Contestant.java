package com.capgemini.Models;

public class Contestant {

    private boolean isAlive;
    private String gender;
    private int attack;
    private int defence;
    private int hp;
    private int level;
    private int amountOfBonusFromItems;

    public Contestant(boolean isAlive, String gender, int attack, int defence, int hp, int level, int amountOfBonusFromItems) {
        this.isAlive = isAlive;
        this.gender = gender;
        this.attack = attack;
        this.defence = defence;
        this.hp = hp;
        this.level = level;
        this.amountOfBonusFromItems = amountOfBonusFromItems;
    }
}
