package com.jmperezra.solidadapter.view.football.viewmodels;

import com.jmperezra.solidadapter.view.football.visitable.ItemVisitable;
import com.jmperezra.solidadapter.view.football.visitable.TypeViewModelFactory;

public class NullViewModel implements ItemVisitable {


    @Override
    public int type(TypeViewModelFactory typeViewModelFactory) {
        return typeViewModelFactory.type(this);
    }
}
