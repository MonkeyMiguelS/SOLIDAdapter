package com.jmperezra.solidadapter.view.football.visitable;

import android.view.View;

import com.jmperezra.solidadapter.view.base.BaseViewHolder;
import com.jmperezra.solidadapter.view.football.FootballPresenter;
import com.jmperezra.solidadapter.view.football.holders.EmptyViewHolder;
import com.jmperezra.solidadapter.view.football.holders.PlayerViewHolder;
import com.jmperezra.solidadapter.view.football.holders.StadiumViewHolder;
import com.jmperezra.solidadapter.view.football.holders.TeamViewHolder;
import com.jmperezra.solidadapter.view.football.viewmodels.NullViewModel;
import com.jmperezra.solidadapter.view.football.viewmodels.PlayerViewModel;
import com.jmperezra.solidadapter.view.football.viewmodels.StadiumViewModel;
import com.jmperezra.solidadapter.view.football.viewmodels.TeamViewModel;

import javax.inject.Inject;

public class TeamFootballTypeViewModel implements TypeViewModelFactory {

    private FootballPresenter presenter;

    @Inject
    public TeamFootballTypeViewModel(FootballPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public int type(PlayerViewModel viewModel) {
        return PlayerViewHolder.LAYOUT;
    }

    @Override
    public int type(StadiumViewModel viewModel) {
        return StadiumViewHolder.LAYOUT;
    }

    @Override
    public int type(TeamViewModel viewModel) {
        return TeamViewHolder.LAYOUT;
    }

    @Override
    public int type(NullViewModel viewModel) {
        return EmptyViewHolder.LAYOUT;
    }

    public BaseViewHolder holder(View view, int type){
        switch (type){
            case PlayerViewHolder.LAYOUT:
                return new PlayerViewHolder(view, presenter);
            case StadiumViewHolder.LAYOUT:
                return new StadiumViewHolder(view, presenter);
            case TeamViewHolder.LAYOUT:
                return new TeamViewHolder(view, presenter);
            default:
                return new EmptyViewHolder(view);
        }
    }
}
