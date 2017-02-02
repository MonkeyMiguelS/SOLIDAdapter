package com.jmperezra.solidadapter.app.di.components;


import com.jmperezra.solidadapter.app.di.modules.AppModule;
import com.jmperezra.solidadapter.app.di.modules.FootballModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(
    modules = {
        AppModule.class
    }
)
public interface AppComponent {

    FootballComponent plus(FootballModule module);

}
