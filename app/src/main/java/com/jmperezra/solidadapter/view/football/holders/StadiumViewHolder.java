package com.jmperezra.solidadapter.view.football.holders;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.jmperezra.solidadapter.R;
import com.jmperezra.solidadapter.view.commons.AssetsHelper;
import com.jmperezra.solidadapter.view.football.FootballPresenter;
import com.jmperezra.solidadapter.view.base.BaseViewHolder;
import com.jmperezra.solidadapter.view.football.viewmodels.StadiumViewModel;

import butterknife.Bind;

public class StadiumViewHolder extends BaseViewHolder<StadiumViewModel> {

    public static final int LAYOUT = R.layout.view_stadium;

    private FootballPresenter presenter;

    private StadiumViewModel stadiumViewModel;

    @Bind(R.id.viewImageStadium)
    ImageView viewImageStadium;

    @Bind(R.id.viewNameStadium)
    TextView viewNameStadium;

    @Bind(R.id.viewCapacity)
    TextView viewCapacity;

    public StadiumViewHolder(View itemView, FootballPresenter presenter) {
        super(itemView);
        this.presenter = presenter;
    }

    @Override
    public void bind(StadiumViewModel element) {
        this.stadiumViewModel = element;
        renderImage();
        renderName();
        renderCapacity();
        setupClick();
    }

    private void renderImage(){
        try{
            viewImageStadium.setImageDrawable(AssetsHelper.obtainDrawable(getContext(), stadiumViewModel.image));
        }catch (Exception ex){
            //todo
        }
    }

    private void renderName(){
        viewNameStadium.setText(stadiumViewModel.name);
    }

    private void renderCapacity(){
        viewCapacity.setText( getContext().getString(R.string.label_people, stadiumViewModel.capacity));
    }

    private void setupClick(){
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onStadiumViewClicked();

            }
        });
    }
}
