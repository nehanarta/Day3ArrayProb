package com.bridglabz;

public class ArrayDup {
    public static void main(String[] args) {
        int[] arr={12,11,34,12,22,34,22,56,11,32,9,5,4,9};
        for(int i=0;i<arr.length;i++)
            for(int j=i+1;j<arr.length;j++){
               if(arr[i]==arr[j]){
                   System.out.println("Duplicate Elements===>"+arr[i]);
               }
            }
    }
}
