package com.ycz.designpattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 元素结构类.
 *
 * @author geolisa
 * @version created in 2018/5/24 15:01
 */
public class ObjectStructure {

    private static final Logger logger = LoggerFactory.getLogger(ObjectStructure.class);
    private List<Element> list = new ArrayList<Element>();

    public void accept(Visitor visitor) {
        Iterator<Element> l = list.iterator();
        while (l.hasNext()) {
            l.next().accept(visitor);
        }
    }

    public void addElement(Element element) {
        list.add(element);
    }

    public void removeElement(Element element) {
        list.remove(element);
    }
}
