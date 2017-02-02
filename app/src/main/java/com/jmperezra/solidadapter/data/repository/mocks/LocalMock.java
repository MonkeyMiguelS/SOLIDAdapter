package com.jmperezra.solidadapter.data.repository.mocks;

import com.jmperezra.solidadapter.domain.models.PlayerModel;
import com.jmperezra.solidadapter.domain.models.StadiumModel;
import com.jmperezra.solidadapter.domain.models.TeamModel;
import com.jmperezra.solidadapter.domain.models.TypePositionPlayer;

import java.util.ArrayList;
import java.util.List;

public class LocalMock {


    public static List<PlayerModel> getMockPlayers(){
        List<PlayerModel> playerModels = new ArrayList<>();
        playerModels.add(new PlayerModel("Sergio","Rico","rico.jpg", 22, 1, TypePositionPlayer.GOALKEEPER));
        playerModels.add(new PlayerModel("David","Soria","soria.jpg", 23, 13, TypePositionPlayer.GOALKEEPER));
        playerModels.add(new PlayerModel("Gabriel","Mercado","mercado.jpg", 29, 24, TypePositionPlayer.DEFENDER));
        playerModels.add(new PlayerModel("Sergio","Escudero","escudero.jpg", 27, 18, TypePositionPlayer.DEFENDER));
        playerModels.add(new PlayerModel("Mariano","Ferreira","mariano.jpg", 29, 3, TypePositionPlayer.DEFENDER));
        playerModels.add(new PlayerModel("Nico","Pareja","pareja.jpg", 31, 24, TypePositionPlayer.DEFENDER));
        playerModels.add(new PlayerModel("Clement","Lenglet","lenglet.jpg", 21, 5, TypePositionPlayer.DEFENDER));
        playerModels.add(new PlayerModel("Clement","Correa","correa.jpg", 22, 11, TypePositionPlayer.MIDFIELDER));
        playerModels.add(new PlayerModel("Clement","Sarabia","sarabia.jpg", 28, 11, TypePositionPlayer.MIDFIELDER));
        playerModels.add(new PlayerModel("Clement","Vazquez","vazquez.jpg", 27, 22, TypePositionPlayer.MIDFIELDER));
        playerModels.add(new PlayerModel("Clement","Ganso","ganso.jpg", 28, 19, TypePositionPlayer.MIDFIELDER));
        playerModels.add(new PlayerModel("Esteve","Nzonzi","nzonzi.jpg", 29, 15, TypePositionPlayer.MIDFIELDER));
        playerModels.add(new PlayerModel("Samir","Nasri","nasri.jpg", 29, 10, TypePositionPlayer.MIDFIELDER));
        playerModels.add(new PlayerModel("Samir","Iborra","iborra.jpg", 29, 8, TypePositionPlayer.MIDFIELDER));
        playerModels.add(new PlayerModel("Victor","","vitolo.jpg", 28, 20, TypePositionPlayer.MIDFIELDER));
        playerModels.add(new PlayerModel("Vietto","","vietto.jpg", 22, 9, TypePositionPlayer.FORWARD));
        playerModels.add(new PlayerModel("Ben","Yedder","benyedder.jpg", 25, 12, TypePositionPlayer.FORWARD));
        playerModels.add(new PlayerModel("Stevan","Jovetic","jovetic.jpg", 25, 10, TypePositionPlayer.FORWARD));
        return playerModels;
    }

    public static StadiumModel getMockStadium(){
        return new StadiumModel("Ramón Sánchez Pizjuan", "estadio.jpg", "50.000");
    }

    public static TeamModel getMockTeam(){
        return new TeamModel("Sevilla F.C", "1905", "escudo.png", "http://www.sevillafc.es");
    }

}
