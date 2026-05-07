package com.example.pog.models;

public class InfoData {
    private String name;
    private String text;
    private String img;
    private String dates;

    public InfoData(String name, String text, String img, String dates) {
        this.name = name;
        this.text = text;
        this.img = img;
        this.dates = dates;
    }

    // гетеро и сетеро
    public String getName() {
        return name;
    }

    public String getText() {
        return text;

    }

    public String getImg() {
        return img;
    }

    public String getDates() {
        return dates;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setDates(String dates) {
        this.dates = dates;
    }
}
