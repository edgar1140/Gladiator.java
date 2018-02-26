package com.company;
import java.util.Scanner;

public class main {
    public static void battle() {
        System.out.println("[1] Attack");
        System.out.println("[2] heal");
        System.out.println("[3] pass");
    }

    public static void show(Gladiator one, Gladiator two) {
        System.out.println(one.name + " : " + " Health: " + one.health + " Rage: " + one.rage);
        System.out.println(two.name + " : " + " Health: " + two.health + " Rage: " + two.rage);

    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Gladiator gladiator1 = new Gladiator("SuperMan", 100, 0, 10, 25);
        Gladiator gladiator2 = new Gladiator("BatMan", 100, 0, 10, 25);

        String choice;
        while (true) {
            /*Gladiator one*/
            battle();
            System.out.println("What move will you like to do?: \n");
            choice = reader.nextLine();
            if (choice.equals("1")) {
                gladiator1.attack(gladiator2);
                show(gladiator1, gladiator2);
            } else if (choice.equals("2")) {
                gladiator1.heal();
                show(gladiator1, gladiator2);
            }
            if (gladiator2.isdead()) {
                System.out.println("Gladiator one wins!!");
                break;
            }

            /*Gladiator two*/
            battle();
            System.out.println("What move will you like to do?: \n");
            choice = reader.nextLine();
            if (choice.equals("1")) {
                gladiator2.attack(gladiator1);
                show(gladiator2, gladiator1);
            } else if (choice.equals("2")) {
                gladiator1.heal();
                show(gladiator1, gladiator1);
            }
            if (gladiator1.isdead()) {
                System.out.println("Gladiator two wins!!");
                break;
            }

        }
    }
}

