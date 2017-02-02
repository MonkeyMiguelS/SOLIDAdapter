package com.jmperezra.solidadapter.data.repository.local;

import com.jmperezra.solidadapter.data.repository.mocks.LocalMock;
import com.jmperezra.solidadapter.domain.models.PlayerModel;
import com.jmperezra.solidadapter.domain.usecase.players.PlayerLocalGateway;

import java.util.List;

import javax.inject.Inject;

public class PlayerLocalGatewayImpl implements PlayerLocalGateway {

    @Inject
    public PlayerLocalGatewayImpl() {

    }

    @Override
    public List<PlayerModel> obtainPlayers(){
        return LocalMock.getMockPlayers();
    }

}
