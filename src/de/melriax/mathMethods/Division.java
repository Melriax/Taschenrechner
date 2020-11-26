package de.melriax.mathMethods;

public class Division {
    public static double mathDivision(String number1, String number2){
        double doubleResult = Double.parseDouble(number1) / Double.parseDouble(number2);
        System.out.println(doubleResult);
        return doubleResult;
    }
}
