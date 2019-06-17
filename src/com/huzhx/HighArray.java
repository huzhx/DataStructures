package com.huzhx;

// HighArray.java
// demonstrates array class with high-level interface
public class HighArray {
    // reference to array
    private long[] array;
    // number of data items
    private int nElems;

    // constructor
    public HighArray(int max) {
        array = new long[max];
        nElems = 0;
    }

    // find specified value
    public boolean find(long searchKey) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (array[j] == searchKey) {
                break;
            }
        }
        return j != nElems;
    }

    // put element into array
    public void insert(long value) {
        array[nElems] = value;
        nElems++;
    }

    // delete specified value
    public boolean delete(long value) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (value == array[j]) {
                break;
            }
        }
        if (j == nElems) {
            // can't find it
            return false;
        } else {
            // found it
            for (int k = j; k < nElems; k++) {
                array[k] = array[k + 1];
            }
            nElems--;
            return true;
        }
    }

    // display array contents
    public void display() {
        for (int j = 0; j < nElems; j++) {
            System.out.println(array[j] + " ");
        }
        System.out.println("");
    }
}
