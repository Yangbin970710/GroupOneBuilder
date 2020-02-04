package com.lovo.hukaibinBuilder;

public class BenzBuilder extends CarBuilder {
    @Override
    public CarModel buildCarModel(String engine, String wheel, String frame) {
        BenzModel b = new BenzModel();
        b.setEngine(engine);
        b.setWheel(wheel);
        b.setFrame(frame);
        return b;
    }
}
