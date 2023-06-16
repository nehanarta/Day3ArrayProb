package com.bridglabz;

public class ArraySecondLargest {
    public static void main(String[] args) {
        int[]arr={3,6,8,9,5,7,10};
        int largest=arr[0];
        int secondLargest=arr[0];
        System.out.print("the given array====>");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }
        }
        System.out.println("SecondLargestNumber=====>"+secondLargest);

    }
}
