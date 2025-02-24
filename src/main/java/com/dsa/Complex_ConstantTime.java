package com.dsa;

public class Complex_ConstantTime {

    static void constantTime() {
        int array[] = {
                1, 2, 4, 5, 6
        };

        /**
         * here the statement which is accessing our array will take constant time no matter we increase the input size.
         * i.e. Complexity is O(1)
         */
        System.out.println(array[0]);
    }

    public static void main(String[] args) {
        constantTime();
    }
}
