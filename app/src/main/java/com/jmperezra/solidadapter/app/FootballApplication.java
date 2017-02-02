package com.jmperezra.solidadapter.app;

import android.app.Application;

import com.jmperezra.solidadapter.app.di.components.AppComponent;
import com.jmperezra.solidadapter.app.di.components.DaggerAppComponent;
import com.jmperezra.solidadapter.app.di.modules.AppModule;

public class FootballApplication extends Application {

    AppComponent appComponent;

    public FootballApplication() {
        super();
        buildAppComponent();
    }

    private void buildAppComponent(){
        appComponent = DaggerAppComponent
                .builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
