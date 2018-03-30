package com.ycz.designpattern.creational.simpleFactory;

import com.ycz.designpattern.creational.simpleFactory.s1.Factory;
import com.ycz.designpattern.creational.simpleFactory.s1.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

@Test
public class FactoryTest {

    private static final Logger logger = LoggerFactory.getLogger(FactoryTest.class);

    public void createProduct() {
        Product product = Factory.getProduct("a");
        logger.debug("create product");
        product.doInput();
        product.setColor("红");
        product.setName("f20");
        product.setSize("720p");
        logger.debug(product.toString());
    }
}
