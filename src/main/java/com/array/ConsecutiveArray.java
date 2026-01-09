package com.array;

/**
 * Given an unsorted array of numbers,
 * the task is to check if the array consists of consecutive numbers.
 */

public class ConsecutiveArray {

    public static boolean checkConsecutiveArray(int arr[]){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        //Find Minimum value and Maximum Value
        for (int i=0;i<arr.length;i++){
        if(arr[i]<min){
             min = arr[i];
        }
        if (arr[i]>max){
            max = arr[i];
        }
        }

        //Check if the elements are consecutive then the value should be max-min+1
        if (max-min+1 != arr.length){
            return false;
        }

        for (int  i=0;i<arr.length;i++){

            int value = Math.abs(arr[i]);
            //Check the array value value is already marked so return false
            if(arr[value-min]<0){
                return false;
            }

            value = value * -1;
        }


        return true;
    }

    public static void main(String[] args) {
        int arr[] = {76,78,76,77,73,74};
        System.out.println(checkConsecutiveArray(arr));
    }
}
