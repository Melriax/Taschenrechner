package de.melriax.mathMethods;

public class Multiplication {
    public static double mathMultiplication(String number1, String number2){
        double resultMultiplication = Double.parseDouble(number1) * Double.parseDouble(number2);
        System.out.println(resultMultiplication);
        return resultMultiplication;
    }
}
