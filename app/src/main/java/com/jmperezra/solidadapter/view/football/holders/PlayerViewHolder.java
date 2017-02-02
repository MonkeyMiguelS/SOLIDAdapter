package com.jmperezra.solidadapter.view.football.holders;

import android.support.annotation.ColorRes;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.jmperezra.solidadapter.R;
import com.jmperezra.solidadapter.domain.models.TypePositionPlayer;
import com.jmperezra.solidadapter.view.commons.AssetsHelper;
import com.jmperezra.solidadapter.view.football.FootballPresenter;
import com.jmperezra.solidadapter.view.base.BaseViewHolder;
import com.jmperezra.solidadapter.view.football.viewmodels.PlayerViewModel;

import butterknife.Bind;
import butterknife.ButterKnife;

public class PlayerViewHolder extends BaseViewHolder<PlayerViewModel> {

    public static final int LAYOUT = R.layout.view_player;

    private PlayerViewModel viewModel;

    FootballPresenter presenter;

    @Bind(R.id.viewImagePlayer)
    ImageView viewImagePlayer;

    @Bind(R.id.viewFullName)
    TextView viewFullName;

    @Bind(R.id.viewAge)
    TextView viewAge;

    @Bind(R.id.viewDorsal)
    TextView viewDorsal;

    @Bind(R.id.viewPosition)
    TextView viewPosition;

    @Bind(R.id.viewTypePosition)
    View viewTypePosition;

    public PlayerViewHolder(View itemView, FootballPresenter presenter) {
        super(itemView);
        this.presenter = presenter;
        ButterKnife.bind(this, itemView);
    }

    @Override
    public void bind(PlayerViewModel element) {
        this.viewModel = element;
        renderImage();
        renderFullName();
        renderAge();
        renderDorsal();
        renderPosition();
        renderTextPosition();
        setupListener();
    }
    
    private void renderImage(){
        try{
            viewImagePlayer.setImageDrawable(AssetsHelper.obtainDrawable(getContext(), viewModel.photo));
        }catch (Exception ex){
            //// TODO: 
        }
    }

    private void renderFullName(){
        viewFullName.setText(viewModel.fullName);
    }

    private void renderAge(){
        viewAge.setText(getContext().getString(R.string.text_age, viewModel.age));
    }

    private void renderDorsal(){
        viewDorsal.setText(viewModel.num);
    }

    private void renderPosition(){
        viewTypePosition
                .setBackgroundColor(ContextCompat.getColor(getContext(), getColorByTypePosition(viewModel.typePositionPlayer)));
    }

    private void renderTextPosition(){
        viewPosition.setText(getContext().getString(getResourceStringPositionPlayer(viewModel.typePositionPlayer)));
    }

    private @ColorRes int getColorByTypePosition(TypePositionPlayer type){
        switch (type){
            case GOALKEEPER: return R.color.colorRed;
            case DEFENDER: return R.color.colorGreen;
            case MIDFIELDER: return R.color.colorOrange;
            case FORWARD: return R.color.colorBlue;
            default:
                return R.color.colorWhite;
        }

    }

    private int getResourceStringPositionPlayer(TypePositionPlayer type){
        switch (type){
            case GOALKEEPER: return R.string.label_goalkeeper;
            case DEFENDER: return R.string.label_defender;
            case MIDFIELDER: return R.string.label_midfielder;
            case FORWARD: return R.string.label_forward;
            default:
                return R.string.label_empty;
        }
    }

    private void setupListener(){
        this.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

}
