package com.junit.learning.Sort;

// {578,354,35,23,12,11,10,9,8,7,6,5,4,3,2,1};


public class QuickSort {
    public static void sort(int[] arr) {
        sortRec(arr, 0, arr.length - 1);
    }

    private static void sortRec(int[] arr, int left, int right){
        if(left >= right) return;
        int pivot = arr[right];
        int temp;
        int j = left - 1;
        for(int i = left; i <= right; i++) {
            if(pivot >= arr[i]) {
                j++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        for(int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
        sortRec(arr, left, j - 1);
        sortRec(arr, j + 1, right);
    }
}
