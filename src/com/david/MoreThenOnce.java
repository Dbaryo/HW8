package com.david;

import java.util.Scanner;

public class MoreThenOnce {
    static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter the length of the list: ");
        final int[] list = new int [SCANNER.nextInt()];
        for ( int i = 0 ; i < list.length ; i++ ){
            System.out.println("Please enter number #" + (i+1) + ": ");
            list[i] =SCANNER.nextInt();
        }
        for ( int i = 0 ; i < ( list.length - 1 ) ; i++ ){
            if ( list[i] == list[i+1] ) {
                System.out.println("The number " + list[i] + " appears more then once in your list.");
                while (i < ( list.length - 1)){
                    if ( list[i] == list[i+1] ){ i++; }
                    else { break; }
                }
            }
        }
    }
}
