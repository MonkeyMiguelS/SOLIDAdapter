package com.jmperezra.solidadapter.domain.usecase.players;

import com.jmperezra.solidadapter.domain.models.PlayerModel;

import java.util.List;

import javax.inject.Inject;

public class GetPlayersUseCase {

    private final PlayerLocalGateway localGateway;

    @Inject
    public GetPlayersUseCase(PlayerLocalGateway localGateway) {
        this.localGateway = localGateway;
    }

    public List<PlayerModel> call(){
        return localGateway.obtainPlayers();
    }
}
