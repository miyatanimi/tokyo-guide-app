package com.example.tokyoguide;

public class Description {
    private String name;
    private String description;
    private int imageId;

    public Description(String name, String description ){
        this.name = name;
        this.description = description;
    }
    public Description(String name, String description, int imageId ){
        this.name = name;
        this.description = description;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageId() {
        return imageId;
    }
}