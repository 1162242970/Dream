package com.tinno.myphoto.javabean;

/**
 * Created by android on 17-11-29.
 */

public class TabData {

    private int Image;
    private String name;

    public TabData(int image, String name) {
        Image = image;
        this.name = name;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
