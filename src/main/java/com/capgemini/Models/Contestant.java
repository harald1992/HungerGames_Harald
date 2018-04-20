package com.capgemini.Models;

public class Contestant {

    private String contestantType;
    private boolean isAlive;
    private String gender;
    private int attack;
    private int defence;
    private int hp;
    private int level;
    private int amountOfBonusFromItems;

    public Contestant(String contestantType, boolean isAlive, String gender, int attack, int defence, int hp, int level, int amountOfBonusFromItems) {
        this.contestantType = contestantType;
        this.isAlive = isAlive;
        this.gender = gender;
        this.attack = attack;
        this.defence = defence;
        this.hp = hp;
        this.level = level;
        this.amountOfBonusFromItems = amountOfBonusFromItems;
    }

    public String getContestantType() {
        return contestantType;
    }

    public void setContestantType(String contestantType) {
        this.contestantType = contestantType;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getAmountOfBonusFromItems() {
        return amountOfBonusFromItems;
    }

    public void setAmountOfBonusFromItems(int amountOfBonusFromItems) {
        this.amountOfBonusFromItems = amountOfBonusFromItems;
    }
}
