package com.jmperezra.solidadapter.view.football.holders;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.jmperezra.solidadapter.R;
import com.jmperezra.solidadapter.view.base.BaseViewHolder;
import com.jmperezra.solidadapter.view.commons.AssetsHelper;
import com.jmperezra.solidadapter.view.football.FootballPresenter;
import com.jmperezra.solidadapter.view.football.viewmodels.TeamViewModel;

import butterknife.Bind;

public class TeamViewHolder extends BaseViewHolder<TeamViewModel> {

    public static final int LAYOUT = R.layout.view_team;

    private FootballPresenter presenter;

    private TeamViewModel teamViewModel;

    @Bind(R.id.viewImageTeam)
    ImageView viewImageTeam;

    @Bind(R.id.viewNameTeam)
    TextView viewNameTeam;

    @Bind(R.id.viewYear)
    TextView viewYear;

    @Bind(R.id.viewWeb)
    TextView viewWeb;

    public TeamViewHolder(View itemView, FootballPresenter presenter) {
        super(itemView);
        this.presenter = presenter;
    }

    @Override
    public void bind(TeamViewModel element) {
        this.teamViewModel = element;
        renderNameTeam();
        renderYearTeam();
        renderWeb();
        renderImage();
        setupClick();
    }

    private void renderNameTeam(){
        viewNameTeam.setText(teamViewModel.name);
    }

    private void renderYearTeam(){
        viewYear.setText(teamViewModel.yearFundation);
    }

    private void renderWeb(){
        viewWeb.setText(teamViewModel.web);
    }

    private void renderImage(){
        try {
            viewImageTeam.setImageDrawable(AssetsHelper.obtainDrawable(getContext(), teamViewModel.image));
        }catch (Exception ex){
            //// TODO
        }
    }

    private void setupClick(){
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onTeamViewClicked();
            }
        });
    }
}
