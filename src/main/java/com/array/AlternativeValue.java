package com.array;

/**
 * Print the array that a alternative value of array
 */

public class AlternativeValue {

    static int[] getAlternates(int[] arr) {
        int size = (arr.length + 1) / 2;   // size of result array
        int[] res = new int[size];

        int index = 0;
        for (int i = 0; i < arr.length; i += 2) {
            res[index++] = arr[i];
        }

        return res;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int[] res = getAlternates(arr);

        for (int x : res) {
            System.out.print(x + " ");
        }
    }
}

