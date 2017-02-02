package com.jmperezra.solidadapter.app.di.modules;


import android.content.Context;

import com.jmperezra.solidadapter.app.FootballApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private final FootballApplication application;

    public AppModule(FootballApplication application) {
        this.application = application;
    }

    @Provides
    @Singleton
    public Context provideApplicationContext() {
        return this.application.getApplicationContext();
    }

}
