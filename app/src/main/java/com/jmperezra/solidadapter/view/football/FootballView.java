package com.jmperezra.solidadapter.view.football;

import com.jmperezra.solidadapter.view.football.visitable.ItemVisitable;

import java.util.List;

public interface FootballView {

    void setupView();

    void updateFootballListView(List<ItemVisitable> itemVisitableList);

}
