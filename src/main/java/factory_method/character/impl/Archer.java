package factory_method.character.impl;

import factory_method.character.interfaces.Character;

public class Archer implements Character {
    private String name;
    private int hp;
    private int damage;

    public Archer() {
    }

    public Archer(String name, int hp, int damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public void specialAbility() {
        System.out.println(name + " shoots arrows!");
    }
}
