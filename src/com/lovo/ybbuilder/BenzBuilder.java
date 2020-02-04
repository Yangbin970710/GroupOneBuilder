package com.lovo.ybbuilder;

public class BenzBuilder extends CarBuilder {
    @Override
    public CarModel buildCarModel(String YQ, String CL, String CJ) {
        BenzModel benzModel = new BenzModel();
        benzModel.setYQ(YQ);
        benzModel.setCL(CL);
        benzModel.setCJ(CJ);
        return benzModel;
    }
}
