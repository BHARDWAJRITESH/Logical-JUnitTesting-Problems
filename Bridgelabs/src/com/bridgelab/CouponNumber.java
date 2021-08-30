package com.bridgelab;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CouponNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         System.out.println("Enter a Number :-");
        int number = scan.nextInt();

        randomCoupon(number);
    }

    static void randomCoupon(int number) {
        int[] table =  new int[number];
        for (int i = 0; i < number; i++) {
            int couponNumbers = (int) ThreadLocalRandom.current().nextInt(1000,9999);
           table[i] = couponNumbers;
            System.out.println(table[i]);
        }
       }
  }

