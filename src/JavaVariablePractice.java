/*
 * Program will take the amount of drinks you drank
 * and the amount of hours it has been, and tell you
 * whether or not you can feed your baby..(not based 
 * on real practice, but assuming you are allowed to
 * one drink per hour.)
 */

import java.util.Scanner;

public class JavaVariablePractice
{

    public static void main(String[] args)

    {
        Scanner input = new Scanner(System.in);
        System.out.println("How many drinks did you finish?");
        double drinkAmt = input.nextDouble();
        
        System.out.println("How many hours since you finished the drink(s)?");
        double hours = input.nextDouble() ;
        
        if(drinkAmt <= hours) {
            System.out.println("Hit the road Jack, you're good to go!!");
        }

        else {
            System.out.println("Not yet, my friend.");
        }
        
    }

}

/* 
 * drinkAmt 
 * 
 * ---COULD NOT IMPLIMENT DOUBLES IN THIS SET UP?---
 * ----THE || (or) WAS NOT WORKING THE WAY I THOUGH IT WOULD, HAD
 * TO DO SEVERAL ELSE IFS OF BASICALLY THE SAME 
 * THING?----
 */
