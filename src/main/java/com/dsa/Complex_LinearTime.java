package com.dsa;

public class Complex_LinearTime {

    static void linearTime() {
        int array[] = {
                1, 2, 4, 5, 6
        };

        for(int i = 0; i <= array.length - 1; i++) {

            /**
             * here the statement which is accessing our array will take more time when input is increased.
             * i.e. time will grow proportionally when input is grown
             * i.e. Complexity is O(n)
             */
            System.out.println((i+1) + " time \t");
            System.out.println(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        linearTime();
    }
}
