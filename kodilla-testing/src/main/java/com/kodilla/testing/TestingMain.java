package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {

        System.out.println("Wprowadzenie do testowania Moduł 6");

        SimpleUser simpleUser = new SimpleUser("theForumUser", "Jefrey");

        String result = simpleUser.getUsername();
        String result1 = simpleUser.getRealName();


        if (result.equals("theForumUser")) {
            System.out.println("test 0 OK");

        } else {
            System.out.println("Error 0 !!!");
        }
        if (result1.equals("Jefrey")) {
            System.out.println("test 1 OK");

        } else {
            System.out.println("Error 1 !!!");
        }



            System.out.println(" ");
            System.out.println(simpleUser.getUsername() + " real name:");
            System.out.println(simpleUser.getRealName());
            System.out.println(simpleUser.getUsername() + " real surname:");

/*
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
                System.out.println("\n" + "Calculator multiply and divide test OK");
            } else {
                System.out.println("Calculator has error!");
*/
            }
        }




