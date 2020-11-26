package de.melriax.main;

public class WelcomeMessage {
    public static void welcomeMsg(){
        System.out.println("""
                --------------------------                           
                Welcome to your calculator
                --------------------------
                """);

        System.out.println("""
                What do you want to calculate?
                a - Addition
                s - Subtraction
                d - Division
                m - Multiplication
                """);
    }
}
