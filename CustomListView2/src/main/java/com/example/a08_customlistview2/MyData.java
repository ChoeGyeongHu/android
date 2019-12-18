package com.example.a08_customlistview2;

public class MyData {
    private String Title;
    private String Description;
    private int img;

    public MyData(String title, String description, int img) {
        Title = title;
        Description = description;
        this.img = img;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
