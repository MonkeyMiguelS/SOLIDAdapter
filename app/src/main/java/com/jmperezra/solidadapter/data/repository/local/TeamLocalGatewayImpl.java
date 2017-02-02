package com.jmperezra.solidadapter.data.repository.local;

import com.jmperezra.solidadapter.data.repository.mocks.LocalMock;
import com.jmperezra.solidadapter.domain.models.TeamModel;
import com.jmperezra.solidadapter.domain.usecase.team.TeamLocalGateway;

import javax.inject.Inject;

public class TeamLocalGatewayImpl implements TeamLocalGateway {

    @Inject
    public TeamLocalGatewayImpl() {

    }

    @Override
    public TeamModel obtainTeam(){
        return LocalMock.getMockTeam();
    }
}
