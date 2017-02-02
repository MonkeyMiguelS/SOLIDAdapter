package com.jmperezra.solidadapter.app.di.modules;

import com.jmperezra.solidadapter.app.di.scopes.ActivityScope;
import com.jmperezra.solidadapter.data.repository.local.PlayerLocalGatewayImpl;
import com.jmperezra.solidadapter.data.repository.local.StadiumLocalGatewayImpl;
import com.jmperezra.solidadapter.data.repository.local.TeamLocalGatewayImpl;
import com.jmperezra.solidadapter.domain.usecase.players.GetPlayersUseCase;
import com.jmperezra.solidadapter.domain.usecase.players.PlayerLocalGateway;
import com.jmperezra.solidadapter.domain.usecase.stadium.GetStadiumUseCase;
import com.jmperezra.solidadapter.domain.usecase.stadium.StadiumLocalGateway;
import com.jmperezra.solidadapter.domain.usecase.team.GetTeamUseCase;
import com.jmperezra.solidadapter.domain.usecase.team.TeamLocalGateway;
import com.jmperezra.solidadapter.view.football.FootballActivity;
import com.jmperezra.solidadapter.view.football.FootballPresenter;
import com.jmperezra.solidadapter.view.football.viewmodels.mappers.PlayerMapper;
import com.jmperezra.solidadapter.view.football.viewmodels.mappers.StadiumMapper;
import com.jmperezra.solidadapter.view.football.viewmodels.mappers.TeamMapper;

import dagger.Module;
import dagger.Provides;

@Module
public class FootballModule extends ActivityModule{


    public FootballModule(FootballActivity activity) {
        super(activity);
    }

    @ActivityScope
    @Provides
    public FootballPresenter provideFootballPresenter(GetPlayersUseCase getPlayersUseCase,
                                                      GetStadiumUseCase getStadiumUseCase,
                                                      GetTeamUseCase getTeamUseCase,
                                                      TeamMapper teamMapper,
                                                      PlayerMapper playerMapper,
                                                      StadiumMapper stadiumMapper){
        return new FootballPresenter(
                        getPlayersUseCase,
                        getStadiumUseCase,
                        getTeamUseCase,
                        teamMapper,
                        playerMapper,
                        stadiumMapper);
    }

    @ActivityScope
    @Provides
    public TeamLocalGateway provideTeamLocalGateway(TeamLocalGatewayImpl impl){
        return impl;
    }

    @ActivityScope
    @Provides
    public StadiumLocalGateway provideStadiumLocalGateway(StadiumLocalGatewayImpl impl){
        return impl;
    }

    @ActivityScope
    @Provides
    public PlayerLocalGateway providePlayerLocalGateway(PlayerLocalGatewayImpl impl){
        return impl;
    }
}
