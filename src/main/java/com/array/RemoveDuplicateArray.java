package com.array;

/**
 * Remove the Duplicate Element in the Aarray
 */

public class RemoveDuplicateArray {

    static int removeArray(int[] arr){
        if (arr.length<=1){
            return arr.length;
        }

        int index=1;

        for(int i=1;i<arr.length;i++){
            if (arr[i]!= arr[i-1]){
                arr[index++]=arr[i];
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int remove  =removeArray(arr);

        for (int i = 0; i < remove; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
