package com.jmperezra.solidadapter.view.football.viewmodels.mappers;

import com.jmperezra.solidadapter.domain.models.StadiumModel;
import com.jmperezra.solidadapter.view.football.viewmodels.StadiumViewModel;
import com.jmperezra.solidadapter.view.football.visitable.ItemVisitable;

import javax.inject.Inject;

public class StadiumMapper {

    @Inject
    public StadiumMapper() {

    }

    public ItemVisitable map(StadiumModel stadiumModel){
        return new StadiumViewModel(stadiumModel.getName(), stadiumModel.getImage(), stadiumModel.getCapacity());
    }
}
