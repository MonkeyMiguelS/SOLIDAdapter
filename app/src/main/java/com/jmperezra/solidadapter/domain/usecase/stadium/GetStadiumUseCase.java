package com.jmperezra.solidadapter.domain.usecase.stadium;

import com.jmperezra.solidadapter.domain.models.StadiumModel;

import javax.inject.Inject;

public class GetStadiumUseCase {

    private final StadiumLocalGateway localGateway;

    @Inject
    public GetStadiumUseCase(StadiumLocalGateway localGateway) {
        this.localGateway = localGateway;
    }

    public StadiumModel call(){
        return localGateway.obtainStadium();
    }
}
