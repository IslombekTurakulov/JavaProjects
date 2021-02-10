package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	    int n = 0;

	    char a1 = 'a';
        System.out.println(a1);
        System.out.println("Type number from 32 to 127: ");
        while (!tryParseInt(input.next(), ref n)) {
            System.out.println("Incorrect input!");
        }
        System.out.println((char)n);
    }


    public static boolean tryParseInt(String value, int n) {
        try {
            n = Integer.parseInt(value);
            if(n < 32 || n > 127)
                return false;
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
