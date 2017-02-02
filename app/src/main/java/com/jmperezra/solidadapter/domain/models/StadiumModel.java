package com.jmperezra.solidadapter.domain.models;

public class StadiumModel {

    private final String name;
    private final String image;
    private final String capacity;

    public StadiumModel(String name, String image, String capacity) {
        this.name = name;
        this.image = image;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public String getCapacity() {
        return capacity;
    }
}
