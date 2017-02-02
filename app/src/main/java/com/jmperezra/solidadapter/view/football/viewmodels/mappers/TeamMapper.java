package com.jmperezra.solidadapter.view.football.viewmodels.mappers;

import com.jmperezra.solidadapter.domain.models.TeamModel;
import com.jmperezra.solidadapter.view.football.viewmodels.TeamViewModel;
import com.jmperezra.solidadapter.view.football.visitable.ItemVisitable;

import javax.inject.Inject;

public class TeamMapper {

    @Inject
    public TeamMapper() {
    }

    public ItemVisitable map(TeamModel teamModel){
        return new TeamViewModel(teamModel.getName(), teamModel.getYearFundation(), teamModel.getImage(), teamModel.getWeb());
    }
}
