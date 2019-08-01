package com.barton;

import java.util.Scanner;

public class Conditional {
    /**
     * try with short hand conditions
     * @param args
     */
    public static void main(String[] args) {
        /**
         * User stuff
         */
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        in.close();

        String cor = "";
        if(n % 2 == 1) {
            cor = "Weird";
        } else{
            if (n >= 6 && n <=20) {
                cor = "Weird";
            }else{
                cor = "Not Weird";
            }
        }
        System.out.println(cor);
    }
}
