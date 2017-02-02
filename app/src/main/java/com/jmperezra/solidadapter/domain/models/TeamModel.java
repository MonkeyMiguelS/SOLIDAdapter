package com.jmperezra.solidadapter.domain.models;

public class TeamModel {

    private final String name;
    private final String yearFundation;
    private final String image;
    private final String web;

    public TeamModel(String name, String yearFundation, String image, String web) {
        this.name = name;
        this.yearFundation = yearFundation;
        this.image = image;
        this.web = web;
    }

    public String getName() {
        return name;
    }

    public String getYearFundation() {
        return yearFundation;
    }

    public String getImage() {
        return image;
    }

    public String getWeb() {
        return web;
    }
}
