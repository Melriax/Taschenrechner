package de.melriax.main;

import de.melriax.mathMethods.Addition;
import de.melriax.mathMethods.Subtraction;
import de.melriax.mathMethods.Division;
import de.melriax.mathMethods.Multiplication;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WelcomeMessage.welcomeMsg(); //displays welcome message

        String userInput = scanner.nextLine(); //userinput to get the right math function

        System.out.print("Number 1: ");
        String number1 = scanner.nextLine();

        System.out.print("Number 2: ");
        String number2 = scanner.nextLine();

        if(userInput.toLowerCase().equals("a")){
            Addition.mathAddition(number1, number2);
        } else if (userInput.toLowerCase().equals("s")){
            Subtraction.mathSubtraction(number1, number2);
        } else if (userInput.toLowerCase().equals("d")){
            Division.mathDivision(number1, number2);
        } else if (userInput.toLowerCase().equals("m")){
            Multiplication.mathMultiplication(number1, number2);
        } else{
            System.out.println("Fehler! Check statement");
        }
    }
}
