package com.example.assignment3.models;



public class Item {
    String name;
    String number;
    int image_id;

    public Item(String name, String details, int image_id) {
        this.name = name;
        this.number = details;
        this.image_id = image_id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String details) {
        this.number = details;
    }

    public int getImage_id() {
        return image_id;
    }

    public void setImage_id(int image_id) {
        this.image_id = image_id;
    }
}
