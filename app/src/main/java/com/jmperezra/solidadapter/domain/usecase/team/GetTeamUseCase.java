package com.jmperezra.solidadapter.domain.usecase.team;

import com.jmperezra.solidadapter.domain.models.TeamModel;

import javax.inject.Inject;

public class GetTeamUseCase {

    private final TeamLocalGateway teamLocalGateway;

    @Inject
    public GetTeamUseCase(TeamLocalGateway teamLocalGateway) {
        this.teamLocalGateway = teamLocalGateway;
    }

    public TeamModel call(){
        return teamLocalGateway.obtainTeam();
    }
}
