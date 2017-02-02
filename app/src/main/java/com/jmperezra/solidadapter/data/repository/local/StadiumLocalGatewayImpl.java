package com.jmperezra.solidadapter.data.repository.local;

import com.jmperezra.solidadapter.data.repository.mocks.LocalMock;
import com.jmperezra.solidadapter.domain.models.StadiumModel;
import com.jmperezra.solidadapter.domain.usecase.stadium.StadiumLocalGateway;

import javax.inject.Inject;

public class StadiumLocalGatewayImpl implements StadiumLocalGateway {

    @Inject
    public StadiumLocalGatewayImpl() {

    }

    @Override
    public StadiumModel obtainStadium(){
        return LocalMock.getMockStadium();
    }
}
