package com.array;

public class BuySellStockProfit {

    public static int oneProfit(int[] arr){
        int minPrice = arr[0];
        int maxProfit = 0;
        for (int i=1;i<arr.length;i++){
            if (arr[i]-minPrice>maxProfit){
                maxProfit = arr[i] - minPrice;
            }

            if (arr[i]>minPrice){
                minPrice = arr[i];
            }
        }
        return maxProfit;
    }

    public static int allTimeProfit(int[] arr){
        int profit = 0;
        int min =arr[0];

        for (int i=1;i<arr.length;i++){
            if (arr[i-1]>=arr[i]) {
            min = arr[i];
            }else {
                profit += arr[i] - min;
                min = arr[i];
            }

        }
        return profit;
    }


    public static void main(String[] args) {
        int[] array = {7,10,15,11,2,7,9,3};
        System.out.println(oneProfit(array));

        int[] arr = {6,4,1,3,5,7,3,1,3,4,7,9,2,5,6,0,1,2};
        System.out.println(allTimeProfit(arr));
    }
}
