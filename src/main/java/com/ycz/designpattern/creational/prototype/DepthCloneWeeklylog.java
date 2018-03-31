package com.ycz.designpattern.creational.prototype;

import com.google.common.base.MoreObjects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class DepthCloneWeeklylog implements Serializable {

    private static final long serialVersionUID = -7777846141242247585L;


    private String name;
    private String title;
    private String content;
    private String date;
    private DepthCloneAttachment attachment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public DepthCloneAttachment getAttachment() {
        return attachment;
    }

    public void setAttachment(DepthCloneAttachment attachment) {
        this.attachment = attachment;
    }


    public DepthCloneWeeklylog deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream byteOutput = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(byteOutput);
        oos.writeObject(this);
        ByteArrayInputStream byteInputStream = new ByteArrayInputStream(byteOutput.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(byteInputStream);
        return (DepthCloneWeeklylog) ois.readObject();
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("name", name)
            .add("title", title)
            .add("content", content)
            .add("date", date)
            .add("attachment", attachment)
            .toString();
    }
}
