package com.huzhx;

public class EvenOddApp {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 2, 5, 6, 8, 9};
        EvenOdd.evenOdd(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
