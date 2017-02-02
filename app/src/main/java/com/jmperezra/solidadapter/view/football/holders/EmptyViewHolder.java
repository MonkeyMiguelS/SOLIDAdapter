package com.jmperezra.solidadapter.view.football.holders;


import android.view.View;

import com.jmperezra.solidadapter.R;
import com.jmperezra.solidadapter.view.base.BaseViewHolder;
import com.jmperezra.solidadapter.view.football.viewmodels.StadiumViewModel;

public class EmptyViewHolder extends BaseViewHolder<StadiumViewModel> {

    public static final int LAYOUT = R.layout.view_empty;


    public EmptyViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void bind(StadiumViewModel element) {

    }
}
