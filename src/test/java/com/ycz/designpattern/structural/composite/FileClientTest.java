package com.ycz.designpattern.structural.composite;

import org.testng.annotations.Test;

@Test
public class FileClientTest {

    //组合模式 理解对树形结构的数据操作比较方便
    public void forKill() {
        AbstractFile file1, file2, file3, file4, file5, file6, file7, file8, file9, file10, file11, file12, file13, file14, file15;
        file1 = new Folder("root");
        file2 = new Folder("level1");
        file3 = new Folder("level2");
        file9 = new Folder("level3");
        file4 = new ImageFile("风景.jpg");
        file7 = new ImageFile("动漫.png");
        file8 = new ImageFile("game.jpg");
        file5 = new TextFile("content.txt");
        file13 = new TextFile("check.txt");
        file14 = new TextFile("todolist.txt");
        file15 = new TextFile("spring_.txt");
        file6 = new VideoFile("quick_hand.mp4");
        file10 = new VideoFile("video_test.mp4");
        file11 = new VideoFile("boomboom.mp4");
        file12 = new VideoFile("tiktik.mp4");
        //file1 添加图片 有1个目录
        file1.add(file4);
        file1.add(file7);
        file1.add(file8);
        file1.add(file2);
        //file2中都是txt 和1个目录
        file2.add(file5);
        file2.add(file13);
        file2.add(file14);
        file2.add(file15);
        file2.add(file3);
        //file3中都是video
        file3.add(file6);
        file3.add(file10);
        file3.add(file11);
        file3.add(file12);
        file3.add(file9);
        file1.killVirus();
    }

    //思路当需要对某个公司下的人进行消息发送的时候，公司下面有子公司，有部门，有人员，这个模式处理的话很合适
    public void sendMessage() {

    }

}
