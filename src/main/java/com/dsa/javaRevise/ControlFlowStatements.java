package com.dsa.javaRevise;

public class ControlFlowStatements {

    public static void ifStatement() {
        int n = -12;
        if (n > 0) {
            System.out.println("yes " + n + " is greater then 0");
        } else {
            System.out.println("no " + n + " is not greater then 0");
        }

        int a = -5;
        if (a > 0) {
            System.out.println("yes " + a + " is greater then 0");
            if (a > 1) {
                System.out.println("yes " + a + " is greater then 1");
                if (a > 2) {
                    System.out.println("yes " + a + " is greater then 2");
                    if (a > 3) {
                        System.out.println("yes " + a + " is greater then 3");
                        if (a > 4) {
                            System.out.println("yes " + a + " is greater then 4");
                        }
                    }
                }
            }
        } else {
            System.out.println("no " + n + " is not greater then 0");
        }

        int x = -5;
        if (x > 4) {
            System.out.println("yes " + x + " is greater then 4");
        } else if (x > 0) {
            System.out.println("yes " + x + " is greater then 0");
        } else {
            System.out.println("no " + x + " is not greater then 0");
        }
    }

    public static void switchStatement() {
        int itemCode = 3;

        String response = "ok";
        switch (response) {
            case "ok", "accepted":
                System.out.println("1XX");
                break;
            case "no", "rejected":
                System.out.println("4XX");
        }

        switch (itemCode) {
            case 0:
                System.out.println("yes");
                break;
            case 1:
                System.out.println("no");
                break;
            case 2:
                System.out.println("yes");
                break;
            case 3:
                System.out.println("no");
                break;
            default:
                System.out.println("no");
                break;
        }

        switch (itemCode) {
            case 1, 2, 3, 4, 5:
                System.out.println("its an electronic gadget.");
                break;

            case 6, 7, 8, 9, 10:
                System.out.println("its not an electronic gadget.");
                break;
        }
    }

    public static void forLoopStatement() {
        for(int i = 0; i <= 10; i++){
            System.out.println("Value of i : " + i);
        }

        for(int i = 10; i <= 1; i--){
            System.out.println("Value of i : " + i);
        }
    }

    public static void whileLoopStatement() {
        int i = 100;
        while (i<=110) {
            System.out.println("Value of i : " + i);
            i++;
        }
    }

    public static void doWhileLoopStatement() {
        int i = 100;
        do {
            System.out.println("Value of i : " + i);
            i++;
        }
        while (i<=110);
    }

    public static void forEachLoopStatement() {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        for(int i : arr){
            System.out.println("Value of i : " + i);
        }
    }

    public static void breakStatement() {
        for(int i = 0; i <= 10; i++){
            System.out.println("Value of i : " + i);
            if(i == 5){
                break;
            }
        }
    }

    public static void continueStatement() {
        for(int i = 0; i <= 10; i++){
            System.out.println("Value of i : " + i);
            if(i == 5){
                continue; //here when i have value of 5 it will again re-iterate the loop and code/implementation below continue statement will be skipped.
            }
            if(i == 5){
                break;
            }
        }
    }

    public static void main(String[] args) {
        ifStatement();
        switchStatement();
        forLoopStatement();
        whileLoopStatement();
        doWhileLoopStatement();
        forEachLoopStatement();
        breakStatement();
        continueStatement();

    }
}
