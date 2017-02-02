package com.jmperezra.solidadapter.view.football;

import com.jmperezra.solidadapter.domain.models.PlayerModel;
import com.jmperezra.solidadapter.domain.models.StadiumModel;
import com.jmperezra.solidadapter.domain.models.TeamModel;
import com.jmperezra.solidadapter.domain.usecase.players.GetPlayersUseCase;
import com.jmperezra.solidadapter.domain.usecase.stadium.GetStadiumUseCase;
import com.jmperezra.solidadapter.domain.usecase.team.GetTeamUseCase;
import com.jmperezra.solidadapter.view.football.viewmodels.mappers.PlayerMapper;
import com.jmperezra.solidadapter.view.football.viewmodels.mappers.StadiumMapper;
import com.jmperezra.solidadapter.view.football.viewmodels.mappers.TeamMapper;
import com.jmperezra.solidadapter.view.football.visitable.ItemVisitable;

import java.util.ArrayList;
import java.util.List;

public class FootballPresenter {

    private FootballView view;

    private final GetPlayersUseCase getPlayersUseCase;
    private final GetStadiumUseCase getStadiumUseCase;
    private final GetTeamUseCase getTeamUseCase;

    private final TeamMapper teamMapper;
    private final PlayerMapper playerMapper;
    private final StadiumMapper stadiumMapper;

    public FootballPresenter(GetPlayersUseCase getPlayersUseCase,
                             GetStadiumUseCase getStadiumUseCase,
                             GetTeamUseCase getTeamUseCase,
                             TeamMapper teamMapper,
                             PlayerMapper playerMapper,
                             StadiumMapper stadiumMapper) {
        this.getPlayersUseCase = getPlayersUseCase;
        this.getStadiumUseCase = getStadiumUseCase;
        this.getTeamUseCase = getTeamUseCase;
        this.teamMapper = teamMapper;
        this.playerMapper = playerMapper;
        this.stadiumMapper = stadiumMapper;
    }

    public void attatchView(FootballView view){
        this.view = view;
        onAttachedView();
    }

    private void onAttachedView(){
        view.setupView();
        loadDataToListView();
    }

    private void loadDataToListView(){
        List<ItemVisitable> itemVisitables = new ArrayList<>();
        itemVisitables.add(teamMapper.map(obtainTeamModel()));
        itemVisitables.add(stadiumMapper.map(obtainStadiumModel()));
        itemVisitables.addAll(playerMapper.map(obtainPlayerModels()));

        view.updateFootballListView(itemVisitables);
    }

    private TeamModel obtainTeamModel(){
        return getTeamUseCase.call();
    }

    private List<PlayerModel> obtainPlayerModels(){
        return getPlayersUseCase.call();
    }

    private StadiumModel obtainStadiumModel(){
        return getStadiumUseCase.call();
    }

    public void onTeamViewClicked(){

    }

    public void onStadiumViewClicked(){

    }
}
