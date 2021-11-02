package com.david;

import java.util.Scanner;

public class BiggestAndSmallest {
    static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter the length of the list: ");
        final int[] list = new int[SCANNER.nextInt()];
        int biggest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < list.length; i++) {
            System.out.println("Please enter number #" + (i + 1) + ": ");
            list[i] = SCANNER.nextInt();
            if ( list[i] > biggest ) { biggest = list[i]; }
            if ( list [i] < smallest ) { smallest = list [i]; }
        }
        System.out.println( smallest + " is the smallest number and " + biggest + " is the biggest number.");
    }
}
