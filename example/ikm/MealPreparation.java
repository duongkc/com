package com.example.ikm;

import java.util.Scanner;

/**
 * Class to
 *
 * @author Imke, Kim, Melany, Rick
 * @version 1.0
 */
public class MealPreparation
{
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) 
    {
        System.out.println("Welcome to the Meal Prepper!");
        System.out.println("What would you like to do?");
        System.out.println("Press 'a' if you want a meal suggestion based on what's in your fridge" +
                "\nPress 'b' if you want a random meal suggestion" +
                "\nPress 'c' if you want to do x");
        startChoice();
    }

    private static void startChoice() {
        //noinspection InfiniteLoopStatement
        while (true) {
            String pick = s.nextLine();
            if ("a".equals(pick) || "b".equals(pick) || "c".equals(pick)) {
                run(pick);
            } else {
                System.out.println("Please type 'a', 'b' or 'c'");
            }
        }
    }

    private static void run(String pick) {
        System.out.println("You've picked something: " + pick);
    }
}