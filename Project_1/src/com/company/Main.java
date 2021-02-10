package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("What's your name?: ");
        Scanner input = new Scanner(System.in);
        String infoName = input.nextLine();
        System.out.print("Your age: ");
        Integer infoAge = Integer.parseInt(input.next());
        if(infoAge < 18) {
            System.out.println("Your age is less than 18!");
        }
        else {
            System.out.print("Amount the loan you wanna get: ");
            Integer amountLoan = Integer.parseInt(input.next());
            System.out.print("Annual Interest rate: ");
            Float infoRate = Float.parseFloat(input.next());
            System.out.print("Period (Years): ");
            Integer infoPeriod = Integer.parseInt(input.next());
            Double result = 0D;
            result = amountLoan * (infoRate*Math.pow((1 + infoRate), infoPeriod))/(Math.pow((1 + infoRate), infoPeriod) - 1);
            System.out.println(infoName + "'s Result: " + result);
        }
    }
}
