package com.ycz.designpattern.structural.adapter;

import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

@Test
public class OperationAdapterTest {

    private static final Logger logger = LoggerFactory.getLogger(OperationAdapterTest.class);

    int data[] = {10, 2, 31, 4, 55, 6, 7, 19, 32, 5, 13};
    ScoreOperation scoreOperation = new OperationAdapter();

    public void sort() {
        int[] new_data = scoreOperation.sort(data);
        logger.debug(Arrays.toString(new_data));
    }

    public void search() {
        int index = scoreOperation.search(data, 17);
        logger.debug("17 find {}", index);
    }
}
