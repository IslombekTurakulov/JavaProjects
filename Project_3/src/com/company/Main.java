package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int N, K;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Type N: ");
            N = input.nextInt();
            System.out.print("Type K: ");
            K = input.nextInt();

            if (N <= 0 || K  <= 0) {
                System.out.println("The numbers shouldn't be less than zero!");
            }
            else {
                String[][] newArr = CreateArray(N, K);
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < newArr[i].length; j++) {
                        System.out.print(newArr[i][j] + " ");
                    }
                    System.out.println(" ");
                }
            }
            System.out.print("Type 0 to exit...");
        }while(input.next() == "0");
    }


    static String[][] CreateArray(int N, int K) {
       String[][] array = new String[N][];
        for (int i = 0; i < N; i++) {
            array[i] = new String[i];
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (Math.pow(N, K - i)) + " ";
            }
        }
        return array;
    }
}
