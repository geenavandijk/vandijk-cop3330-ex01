/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Geena-Maria van Dijk
 */

package org.example;

import java.util.Scanner;

public class Hello {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        Name name = new Name ();

        System.out.printf("What is your name? ");

        String theName = input.nextLine();

        name.setName (theName);

        System.out.println("Hello, " + name.getName() +", nice to meet you!");

    } //End of method

}//End of class
