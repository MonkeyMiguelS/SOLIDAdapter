package com.jmperezra.solidadapter.view.football;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.jmperezra.solidadapter.R;
import com.jmperezra.solidadapter.app.FootballApplication;
import com.jmperezra.solidadapter.app.di.modules.FootballModule;
import com.jmperezra.solidadapter.view.football.adapter.PlayerAdapter;
import com.jmperezra.solidadapter.view.football.visitable.ItemVisitable;
import com.jmperezra.solidadapter.view.football.visitable.TeamFootballTypeViewModel;

import java.util.List;

import javax.inject.Inject;

public class FootballActivity extends AppCompatActivity implements FootballView{

    RecyclerView viewListPlayers;

    PlayerAdapter playerAdapter;

    @Inject
    FootballPresenter presenter;

    @Inject
    TeamFootballTypeViewModel teamFootballTypeViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupActivityComponent();
        setContentView(R.layout.activity_main);
        presenter.attatchView(this);
    }

    private void setupActivityComponent() {
        ((FootballApplication)getApplication()).getAppComponent().plus(new FootballModule(this)).inject(this);
    }

    @Override
    public void setupView(){
        setupListView();
    }

    private void setupListView(){
        viewListPlayers = (RecyclerView) findViewById(R.id.viewListPlayers);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        viewListPlayers.setLayoutManager(mLayoutManager);

        playerAdapter = new PlayerAdapter(teamFootballTypeViewModel);
        viewListPlayers.setAdapter(playerAdapter);
    }

    @Override
    public void updateFootballListView(List<ItemVisitable> itemVisitableList){
        playerAdapter.updateListView(itemVisitableList);
    }
}
