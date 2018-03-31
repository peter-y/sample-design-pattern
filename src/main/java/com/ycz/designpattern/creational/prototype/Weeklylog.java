package com.ycz.designpattern.creational.prototype;

import com.google.common.base.MoreObjects;

public class Weeklylog implements Cloneable {

    private String name;
    private String title;
    private String content;
    private String date;
    private Attachment attachment;

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

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public Weeklylog clone() throws CloneNotSupportedException {
        Object object = null;
        object = super.clone();
        return (Weeklylog) object;
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
