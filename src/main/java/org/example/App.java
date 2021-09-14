package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Rebecca Pina Partidas
 */

// Libraries
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Asks user for name and outputs a message
        System.out.print("What is your name? ");
        String name = input.nextLine();

        System.out.println("Hello, " + name + ", nice to meet you!");
    }
}
