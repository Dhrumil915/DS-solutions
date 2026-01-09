package com.array;

/**
 * Check the array is sorted or not
 */
public class CheckSortedArray {

    static boolean isSorted(int[] arr){
        for (int i=1;i<arr.length;i++){
            if (arr[i - 1] > arr[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println(isSorted(arr));
    }
}
