package com.junit.learning;

import com.junit.learning.Sort.InsertionSort;
import com.junit.learning.Sort.QuickSort;
import com.junit.learning.Sort.SelectionSort;

public class Main {
    public static void main(String[] args) {
        int[] list = {8,2,4,7,1,3,9,6,5};
        QuickSort.sort(list);
    }
}
