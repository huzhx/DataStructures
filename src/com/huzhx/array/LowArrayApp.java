package com.huzhx.array;

public class LowArrayApp {
    public static void main(String[] args) {
        // reference
        LowArray array;
        // create LowArray object
        array = new LowArray(100);
        // number of items in array
        int nElems = 0;
        // loop variable
        int j;

        // insert 3 items
        array.setElem(0, 77);
        array.setElem(1, 99);
        array.setElem(2, 44);
        // now 3 items in array
        nElems = 3;
        // display items
        for (j = 0; j < nElems; j++) {
            System.out.println(array.getElem(j) + " ");
        }
        System.out.println("");

        int searchKey = 26;
        for (j = 0; j < nElems; j++) {
            if (array.getElem(j) == searchKey) {
                break;
            }
        }
        if (j == nElems) {
            System.out.println("Can't find " + searchKey);
        } else {
            System.out.println("Found " + searchKey);
        }

        // delete value 99
        // look for it
        for (j = 0; j < nElems; j++) {
            if (array.getElem(j) == 99) {
                break;
            }
        }
        // shift higher ones down
        for (int k = j; k < nElems; k++) {
            array.setElem(k, array.getElem(k + 1));
        }
        nElems--;

        for (j = 0; j < nElems; j++) {
            System.out.println(array.getElem(j) + " ");
        }
        System.out.println("");
    }
}
