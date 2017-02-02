package com.jmperezra.solidadapter.view.football.viewmodels;

import com.jmperezra.solidadapter.domain.models.TypePositionPlayer;
import com.jmperezra.solidadapter.view.football.visitable.ItemVisitable;
import com.jmperezra.solidadapter.view.football.visitable.TypeViewModelFactory;

public class PlayerViewModel implements ItemVisitable {

    public final String fullName;
    public final String photo;
    public final String age;
    public final String num;
    public final TypePositionPlayer typePositionPlayer;

    public PlayerViewModel(String fullName, String photo, int age, int num, TypePositionPlayer typePositionPlayer) {
        this.fullName = fullName;
        this.photo = photo;
        this.age = String.valueOf(age);
        this.num = String.valueOf(num);
        this.typePositionPlayer = typePositionPlayer;
    }

    @Override
    public int type(TypeViewModelFactory typeViewModelFactory) {
        return typeViewModelFactory.type(this);
    }
}
