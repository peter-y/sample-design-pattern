package com.ycz.designpattern.structural.composite;

import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Folder extends AbstractFile {

    public Folder(String name) {
        setName(name);
    }

    private static final Logger logger = LoggerFactory.getLogger(Folder.class);
    private ArrayList<AbstractFile> fileList = new ArrayList<AbstractFile>();

    public void add(AbstractFile file) {
        fileList.add(file);
    }

    public void remove(AbstractFile file) {
        fileList.remove(file);
    }

    public AbstractFile getChild(int i) {
        return fileList.get(i);
    }

    public void killVirus() {
        logger.debug("对文件夹 {} 进行杀毒", getName());
        for (AbstractFile file : fileList) {
            file.killVirus();
        }
    }
}
