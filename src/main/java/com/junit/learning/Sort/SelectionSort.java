package com.junit.learning.Sort;

public class SelectionSort {
    public static void sort() {
        int[] list = {5,9,2,6,1,9,0,5,3,7,5,8,3,12,35,578,354,23};
        int temp = 0;
        int minIndex = -1;

        for(int i = 0; i < list.length - 1; i++) {
            minIndex = i;
            for(int j = i + 1; j <= list.length - 1; j++) {
                if(list[minIndex] > list[j])
                    minIndex = j;
            }
            temp = list[i];
            list[i] = list[minIndex];
            list[minIndex] = temp;
        }
    }
}
