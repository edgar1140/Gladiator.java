package com.company;

import java.util.Random;

public class Gladiator {
    public String name;
    public Integer health;
    public Integer rage;
    public Integer damage_low;
    public Integer damage_high;
    Random rand = new Random();

    public Gladiator(String name, Integer health, Integer rage, Integer damage_high, Integer damage_low) {
        this.name = name;
        this.health = health;
        this.rage = rage;
        this.damage_high = damage_high;
        this.damage_low = damage_low;
    }

    public String attack(Gladiator defender) {
        int damage = rand.nextInt(this.damage_high) + this.damage_low;
        if (this.rage > damage) {
            defender.health = Integer.max(0, defender.health - (2 * damage));
            this.rage = 0;
            return "CRIT Hit!";
        } else {
            defender.health = Integer.max(0, defender.health - damage);
            this.rage = Integer.min(this.rage + 15, 100);
            return "HIT!";
        }
    }

        public void heal () {
            if (this.rage >= 10) {
                this.rage = Integer.max(0, this.rage - 10);
                this.health = Integer.min(100, this.health + 5);
            } else {
                this.rage = 0;
            }
        }

        public boolean isdead () {
            if (this.health <= 0) {
                return true;
            } else {
                return false;
            }
        }


    }
