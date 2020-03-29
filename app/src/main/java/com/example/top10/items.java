package com.example.top10;

public class items {
    private int mImage;
    private String name;
    private String cuisine;
    private String location;
    private String rating;

    public items(int image, String text1, String text2, String text3, String text4) {
        mImage = image;
        name = text1;
        cuisine = text2;
        location = text3;
        rating = text4;
    }

    public int getmImage() {
        return mImage;
    }


    public String getName() {
        return name;
    }

    public String getCuisine() {
        return cuisine;
    }

    public String getLocation() {
        return location;
    }

    public String getRating() {
        return rating;
    }


}
