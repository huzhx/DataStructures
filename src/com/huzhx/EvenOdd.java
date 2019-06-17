package com.huzhx;

/* Your input is an array of integers,
and you have to reorder its entries so that the even entries appear first. */
public class EvenOdd {
    public static void evenOdd(int[] a) {
        int nextEven = 0;
        int nextOdd = a.length - 1;
        while (nextEven < nextOdd) {
            if (a[nextEven] % 2 == 0) {
                nextEven++;
            } else {
                int tmp = a[nextEven];
                a[nextEven] = a[nextOdd];
                a[nextOdd--] = tmp;
            }
        }
    }
}

