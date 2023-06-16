package com.bridglabz;

public class ArrayRev {
    public static void main(String[]args){
        int[] arr={1,2,3,4,5,6,7,8,9};
        int arrlength=arr.length-1;
        for(int i=arrlength;i>=0; i--){
            System.out.print(arr[i]+",");
        }
    }
}
