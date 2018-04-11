package com.retrofitdemo.retrofitlearnigtopics.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by KP on 4/10/2018.
 */

public class FruitModel {

    @SerializedName("name")
    private String fruit_name;

    @SerializedName("calaries")
    private String fruit_cal;

    @SerializedName("image_path")
    private String fruit_image;

    public String getFruit_name() {
        return fruit_name;
    }

    public void setFruit_name(String fruit_name) {
        this.fruit_name = fruit_name;
    }

    public String getFruit_cal() {
        return fruit_cal;
    }

    public void setFruit_cal(String fruit_cal) {
        this.fruit_cal = fruit_cal;
    }

    public String getFruit_image() {
        return fruit_image;
    }

    public void setFruit_image(String fruit_image) {
        this.fruit_image = fruit_image;
    }
}
