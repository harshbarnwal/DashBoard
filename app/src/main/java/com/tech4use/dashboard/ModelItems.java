package com.tech4use.dashboard;

public class ModelItems {

    //initiating widgets for all the items of the app
    int img;
    String text;
    String count;

    //creating the constructor of the items
    public ModelItems(int img, String text, String count) {
        this.img = img;
        this.text = text;
        this.count = count;
    }

    // returning the created items
    public int getImg() {
        return img;
    }

    public String getText() {
        return text;
    }

    public String getCount() {
        return count;
    }
}
