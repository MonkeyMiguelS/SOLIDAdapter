package com.jmperezra.solidadapter.view.football.viewmodels.mappers;

import com.jmperezra.solidadapter.domain.models.PlayerModel;
import com.jmperezra.solidadapter.view.football.viewmodels.PlayerViewModel;
import com.jmperezra.solidadapter.view.football.visitable.ItemVisitable;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class PlayerMapper {

    @Inject
    public PlayerMapper() {

    }

    public List<ItemVisitable> map(List<PlayerModel> playerModels){
        List<ItemVisitable> players = new ArrayList<>();
        for(PlayerModel playerModel : playerModels){
            players.add(map(playerModel));
        }
        return players;
    }

    public ItemVisitable map(PlayerModel playerModel){
        return new PlayerViewModel(
                playerModel.getName() + " " + playerModel.getSurname(),
                playerModel.getPhoto(),
                playerModel.getAge(),
                playerModel.getNum(),
                playerModel.getTypePositionPlayer()
        );
    }

}
