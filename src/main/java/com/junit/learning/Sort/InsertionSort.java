package com.junit.learning.Sort;

public class InsertionSort {
    public static void sort(){
        int[] list = {578,354,35,23,12,11,10,9,8,7,6,5,4,3,2,1};

        for(int i = 1; i < list.length; i++) {
            int key = list[i];
            int j = i - 1;
            while(j >= 0 && list[j] > key) {
                list[j+1] = list[j];
                j--;
            }
            list[j+1] = key;
            for(int a : list){
                System.out.print(a + " ");
            }
            System.out.println();
        }
        for(int i : list){
            System.out.print(i + " ");
        }
    }
}
