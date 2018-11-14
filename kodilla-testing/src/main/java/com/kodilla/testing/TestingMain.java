package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator calculator = new Calculator();
        double addResult = calculator.add(180, 20);
        double subResult = calculator.subtract(180, 20);
        double multResult = calculator.multiply(180, 20);
        double divResult = calculator.divide(180, 20);
        if ((addResult == 200) && (subResult == 160)) {
            System.out.println("Calculator add and subtract test OK");
        } else {
            System.out.println("Calculator has error!");
        }
        if ((multResult == 3600) && (divResult == 9)) {
            System.out.println("Calculator multiply and divide test OK");
        } else {
            System.out.println("Calculator has error!");
        }
    }
}
