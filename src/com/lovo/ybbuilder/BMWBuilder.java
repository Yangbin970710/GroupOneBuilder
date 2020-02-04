package com.lovo.ybbuilder;

public class BMWBuilder extends CarBuilder {
    @Override
    public CarModel buildCarModel(String YQ, String CL, String CJ) {
        BMWModel bmwModel = new BMWModel();
        bmwModel.setYQ(YQ);
        bmwModel.setCL(CL);
        bmwModel.setCJ(CJ);
        return bmwModel;
    }
}
