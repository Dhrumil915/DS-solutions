package com.array;

/**
 * Reverse Array with two pointer
 */

public class ReverseArrayPart2 {

    static void reverseArray(int[] arr){
        int left=0,right=arr.length-1;
        while(left<right){
           int temp = arr[left];
           arr[left] = arr[right];
           arr[right] = temp;

           left++;

           right --;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2};
        reverseArray(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
