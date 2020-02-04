package com.lovo.wutaobuilder;

public class BMWBuilder extends CarBuilder {
    @Override
    public CarModel createCarModel(String carEngine, String carWheel, String carBody) {
        BMWModel bmwModel = new BMWModel();
        bmwModel.setCarBody(carBody);
        bmwModel.setCarEngine(carEngine);
        bmwModel.setCarWheel(carWheel);
        return bmwModel;

    }
}
