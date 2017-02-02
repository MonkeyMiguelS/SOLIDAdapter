package com.jmperezra.solidadapter.view.football.viewmodels;


import com.jmperezra.solidadapter.view.football.visitable.ItemVisitable;
import com.jmperezra.solidadapter.view.football.visitable.TypeViewModelFactory;

public class TeamViewModel implements ItemVisitable {

    public final String name;
    public final String yearFundation;
    public final String image;
    public final String web;

    public TeamViewModel(String name, String yearFundation, String image, String web) {
        this.name = name;
        this.yearFundation = yearFundation;
        this.image = image;
        this.web = web;
    }

    @Override
    public int type(TypeViewModelFactory typeViewModelFactory) {
        return typeViewModelFactory.type(this);
    }
}
