package com.david;

import java.util.Scanner;

public class Reverse {
    static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter the length of the list: ");
        final int[] numbers = new int [SCANNER.nextInt()];
        for ( int i = 0 ; i < numbers.length ; i++ ){
            System.out.println("Please enter number #" + (i+1) + ": ");
            numbers[(numbers.length) - (i+1) ] =SCANNER.nextInt();
        }
        for ( int i = 0 ; i <= numbers.length ; i++ ){
            System.out.print( numbers[i] + " ");
        }
    }
}
