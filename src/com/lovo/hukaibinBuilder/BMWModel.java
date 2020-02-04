package com.lovo.hukaibinBuilder;

public class BMWModel extends CarModel {
    public String engine;
    public String wheel;
    public String frame;

    @Override
    public void getEngine() {
        System.out.println(this.engine);
    }

    @Override
    public void getWheel() {
        System.out.println(this.wheel);
    }

    @Override
    public void getFrame() {
        System.out.println(this.frame);
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }
}
