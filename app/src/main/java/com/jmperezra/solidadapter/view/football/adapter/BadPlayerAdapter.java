package com.jmperezra.solidadapter.view.football.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jmperezra.solidadapter.R;
import com.jmperezra.solidadapter.view.base.BaseViewHolder;
import com.jmperezra.solidadapter.view.football.FootballPresenter;
import com.jmperezra.solidadapter.view.football.holders.PlayerViewHolder;
import com.jmperezra.solidadapter.view.football.holders.StadiumViewHolder;
import com.jmperezra.solidadapter.view.football.holders.TeamViewHolder;
import com.jmperezra.solidadapter.view.football.viewmodels.PlayerViewModel;
import com.jmperezra.solidadapter.view.football.viewmodels.StadiumViewModel;
import com.jmperezra.solidadapter.view.football.visitable.ItemVisitable;

import java.util.ArrayList;
import java.util.List;


public class BadPlayerAdapter extends RecyclerView.Adapter<BaseViewHolder>{

    private List<ItemVisitable> viewModels;
    private int TYPE_PLAYER = 1;
    private int TYPE_STADIUM = 2;
    private int TYPE_TEAM = 3;
    private FootballPresenter presenter;

    public BadPlayerAdapter(FootballPresenter presenter) {
        this.viewModels = new ArrayList<>();
        this.presenter = presenter;
    }

    public void updateListView(List<ItemVisitable> viewModels){
        this.viewModels = viewModels;
        notifyDataSetChanged();
    }

    @Override
    public int getItemViewType(int position) {
        if (viewModels.get(position) instanceof PlayerViewModel){
            return TYPE_PLAYER;
        }else if (viewModels.get(position) instanceof StadiumViewModel){
            return TYPE_STADIUM;
        }else{
            return TYPE_TEAM;
        }
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        if (viewType == TYPE_PLAYER){
            view = getInflatedView(parent, R.layout.view_player);
            return new PlayerViewHolder(view, presenter);
        }else if (viewType == TYPE_STADIUM){
            view = getInflatedView(parent, R.layout.view_stadium);
            return new StadiumViewHolder(view, presenter);
        }else{
            view = getInflatedView(parent, R.layout.view_team);
            return new TeamViewHolder(view, presenter);
        }
    }

    private View getInflatedView(ViewGroup parent, int resourceLayout){
        return LayoutInflater
                .from(parent.getContext())
                .inflate(resourceLayout, parent, false);
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        ItemVisitable item = viewModels.get(position);
        //holder.renderName(item.getName());
        //holder.renderAddress(item.getAddress());
    }

    @Override
    public int getItemCount() {
        return viewModels.size();
    }
}
