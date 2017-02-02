package com.jmperezra.solidadapter.view.football.viewmodels;

import com.jmperezra.solidadapter.view.football.visitable.ItemVisitable;
import com.jmperezra.solidadapter.view.football.visitable.TypeViewModelFactory;

public class StadiumViewModel implements ItemVisitable {

    public final String name;
    public final String image;
    public final String capacity;

    public StadiumViewModel(String name, String image, String capacity) {
        this.name = name;
        this.image = image;
        this.capacity = capacity;
    }

    @Override
    public int type(TypeViewModelFactory typeViewModelFactory) {
        return typeViewModelFactory.type(this);
    }
}
