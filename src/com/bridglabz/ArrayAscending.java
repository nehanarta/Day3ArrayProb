package com.bridglabz;

public class ArrayAscending {
    public static void main(String[] args) {
        int[] arr = {2, 4, 8, 3, 23, 56, 24, 11, 19, 21, 15};
        int temp = 0;
        System.out.println("Before ascending===>");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }

            }
        }
            System.out.println("");
            System.out.print("after ascending===>");

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+",");

            }
        }
    }


