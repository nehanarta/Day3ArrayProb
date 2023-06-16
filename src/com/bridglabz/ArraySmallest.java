package com.bridglabz;

public class ArraySmallest {
    public static void main(String[] args) {


    int[] A={2,6,9,5,9,11,10};
    int min=A[0];
for(int i=0;i<A.length;i++){
        if(A[i]<min)
            min=A[i];

    }
        System.out.println(min);
}

}
