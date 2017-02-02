package com.jmperezra.solidadapter.view.football.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jmperezra.solidadapter.view.base.BaseViewHolder;
import com.jmperezra.solidadapter.view.football.visitable.ItemVisitable;
import com.jmperezra.solidadapter.view.football.visitable.TypeViewModelFactory;

import java.util.ArrayList;
import java.util.List;


public class PlayerAdapter extends RecyclerView.Adapter<BaseViewHolder>{

    private List<ItemVisitable> viewModels;
    private TypeViewModelFactory typeViewModelFactory;

    public PlayerAdapter(TypeViewModelFactory typeViewModelFactory) {
        this.viewModels = new ArrayList<>();
        this.typeViewModelFactory = typeViewModelFactory;
    }

    public void updateListView(List<ItemVisitable> viewModels){
        this.viewModels = viewModels;
        notifyDataSetChanged();
    }

    @Override
    public int getItemViewType(int position) {
        return viewModels.get(position).type(typeViewModelFactory);
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater
                    .from(parent.getContext())
                    .inflate(viewType, parent, false);
        return typeViewModelFactory.holder(view, viewType);
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        holder.bind(viewModels.get(position));
    }

    @Override
    public int getItemCount() {
        return viewModels.size();
    }
}
