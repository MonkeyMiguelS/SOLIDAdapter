package com.jmperezra.solidadapter.view.football.visitable;

import android.view.View;

import com.jmperezra.solidadapter.view.base.BaseViewHolder;
import com.jmperezra.solidadapter.view.football.viewmodels.NullViewModel;
import com.jmperezra.solidadapter.view.football.viewmodels.PlayerViewModel;
import com.jmperezra.solidadapter.view.football.viewmodels.StadiumViewModel;
import com.jmperezra.solidadapter.view.football.viewmodels.TeamViewModel;

public interface TypeViewModelFactory {

    int type(PlayerViewModel viewModel);
    int type(StadiumViewModel viewModel);
    int type(TeamViewModel viewModel);
    int type(NullViewModel viewModel);

    BaseViewHolder holder(View view, int type);
}
