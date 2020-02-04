package com.lovo.wutaobuilder;

public class BenzBuilder extends CarBuilder{
    @Override
    public CarModel createCarModel(String carEngine, String carWheel, String carBody) {
        BenzModel benzModel = new BenzModel();
        benzModel.setCarEngine(carEngine);
        benzModel.setCarWheel(carWheel);
        benzModel.setCarBody(carBody);
        return benzModel;
    }
}
