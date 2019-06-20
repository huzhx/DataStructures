package com.huzhx.array;

public class HighArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;
        HighArray arr;
        arr = new HighArray(maxSize);

        // insert 3 items
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);

        arr.display();

        int searchKey = 35;
        if (arr.find(searchKey)) {
            System.out.println("Found " + searchKey);
        } else {
            System.out.println("Can't find + " + searchKey);
        }

        arr.delete(77);
        arr.display();
    }
}
