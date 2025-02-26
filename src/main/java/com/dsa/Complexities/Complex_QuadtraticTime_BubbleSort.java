package com.dsa.Complexities;

public class Complex_QuadtraticTime_BubbleSort {
    static void bubbleSort() {
        int array[] = {
                4, 2, 1, 3
        };

        System.out.println("Before bubble sort: ");
        for(int a : array){
            System.out.print(a + ",");
        }

        int i,j,temp;
        boolean flag;

        for(i = 0; i < array.length-1; i++){
            flag = false;
            for(j = 0; j < array.length-i-1; j++){
                if(array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag){
                break;
            }
        }
        System.out.println("\nAfter bubble sort: ");
        for(int s : array){
            System.out.print(s + ",");
        }
    }

    public static void main(String[] args) {
        bubbleSort();
    }

}
