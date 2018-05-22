package com.ycz.designpattern.structural.adapter;

public class OperationAdapter implements ScoreOperation {

    private BinarySearch binarySearch;
    private QuickSort quickSort;

    public OperationAdapter() {
        binarySearch = new BinarySearch();
        quickSort = new QuickSort();
    }

    public int[] sort(int[] array) {
        return quickSort.quickSort(array);
    }

    public int search(int[] array, int key) {
        return binarySearch.binarySearch(array, key);
    }
}
