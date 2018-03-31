package com.ycz.designpattern.creational.prototype;

import com.google.common.base.MoreObjects;
import java.io.Serializable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DepthCloneAttachment implements Serializable {

    private static final Logger logger = LoggerFactory.getLogger(DepthCloneAttachment.class);

    private static final long serialVersionUID = -1604116398862184180L;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void download() {
        logger.debug("下载文件 {}", getName());
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("name", name)
            .toString();
    }
}
