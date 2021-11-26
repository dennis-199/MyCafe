package com.example.mycafe;

public class fooddata {

    private String time;
    private String about;
    private Integer foodImage;

    public fooddata(String time, String about, Integer foodImage) {
        this.time = time;
        this.about = about;
        this.foodImage = foodImage;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Integer getFoodImage() {
        return foodImage;
    }

    public void setFoodImage(Integer foodImage) {
        this.foodImage = foodImage;
    }
}
