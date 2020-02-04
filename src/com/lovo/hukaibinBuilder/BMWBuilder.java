package com.lovo.hukaibinBuilder;

public class BMWBuilder extends CarBuilder {
    @Override
    public CarModel buildCarModel(String engine, String wheel, String frame) {
        BMWModel bm = new BMWModel();
        bm.setEngine(engine);
        bm.setWheel(wheel);
        bm.setFrame(frame);
        return bm;
    }
}
