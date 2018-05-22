package com.ycz.designpattern.structural.adapter;

public interface ScoreOperation {

    /**
     * 排序
     *
     * @param array 需要排序的int数组
     */
    public int[] sort(int array[]);

    /**
     * 搜索指定key
     *
     * @param array 需要排序的int数组
     * @param key 需要搜索的值
     */
    public int search(int array[], int key);
}
