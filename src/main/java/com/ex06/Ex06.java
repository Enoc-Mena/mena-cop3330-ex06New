/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Enoc Mena
 */

package com.ex06;
import java.util.Scanner;
import java.util.Calendar;

public class Ex06 {

    public static void main(String[] args) {

        String age, retireAge;
        int year = Calendar.getInstance().get(Calendar.YEAR);

        Scanner userAge = new Scanner(System.in);
        System.out.print("What is your current age? ");
        age = userAge.nextLine();
        int ageParse = Integer.parseInt(age);

        Scanner userRetirementAge = new Scanner(System.in);
        System.out.print("What is your current age? ");
        retireAge = userRetirementAge.nextLine();
        int retireAgeParse = Integer.parseInt(retireAge);

        int yearsLeft = retireAgeParse-ageParse;

        System.out.print("You have " + (retireAgeParse-ageParse) + " years left until you retire.");
        System.out.println("");
        System.out.print("Its " + year + ", so you can retire in " + (year + yearsLeft));

    }

}
