package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    //calc
        Calculator simpleCalculator = new Calculator();
        int resultAdd = simpleCalculator.add(5 , 6);
        int resultSub = simpleCalculator.substract( 7 , 6);

        if ((resultAdd == 11) && (resultSub == 1)) {
            System.out.println("Calculator test OK");
        } else {
            System.out.println("Calculator has error!");
        }
    }
}
