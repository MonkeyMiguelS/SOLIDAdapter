package com.jmperezra.solidadapter.domain.usecase.players;

import com.jmperezra.solidadapter.domain.models.PlayerModel;

import java.util.List;

public interface PlayerLocalGateway {

    List<PlayerModel> obtainPlayers();

}
