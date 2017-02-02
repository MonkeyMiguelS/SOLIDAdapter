package com.jmperezra.solidadapter.app.di.components;

import com.jmperezra.solidadapter.app.di.modules.FootballModule;
import com.jmperezra.solidadapter.app.di.scopes.ActivityScope;
import com.jmperezra.solidadapter.view.football.FootballActivity;

import dagger.Subcomponent;

@ActivityScope
@Subcomponent(
    modules = {
        FootballModule.class
    }
)
public interface FootballComponent {
    void inject(FootballActivity activity);
}
