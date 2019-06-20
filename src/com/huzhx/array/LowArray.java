package com.huzhx.array;

// LowArray.java
// demonstrates array class with low-level interface
// to run this program: C>java LowArrayApp
public class LowArray {
    // ref to array
    private long[] array;

    // constructor
    public LowArray(int size) {
        // create an array
        array = new long[size];
    }

    // set value
    public void setElem(int index, long value) {
        array[index] = value;
    }

    // get value
    public long getElem(int index) {
        return array[index];
    }
}
