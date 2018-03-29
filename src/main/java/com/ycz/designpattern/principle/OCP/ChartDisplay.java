package com.ycz.designpattern.principle.OCP;

public class ChartDisplay {

    private AbstractChart chat;

    public ChartDisplay(AbstractChart chat) {
        this.chat = chat;
    }

    public void setChat(AbstractChart chat) {
        this.chat = chat;
    }

    public void display() {
        chat.display();
    }
}
