package com.array;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Given an array arr[] of size n, the task is to find all the Leaders in the array.
 * An element is a Leader if it is greater than or equal to all the elements to its right side.
 * Note: The rightmost element is always a leader.
 */

public class LeaderArray {

    static ArrayList<Integer> leaders(int[] arr){
        ArrayList<Integer> array = new ArrayList<>();
        int n = arr.length;
        // Find Right most value
        int maxRight = arr[n-1];

        for (int i=n-2;i >= 0; i--){
           if (arr[i]>=maxRight){
               maxRight = arr[i];
               array.add(maxRight);
           }
        }

        Collections.reverse(array);

        return array;
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        System.out.println(leaders(arr));
    }
}
