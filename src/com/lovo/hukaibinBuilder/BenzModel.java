package com.lovo.hukaibinBuilder;

public class BenzModel extends CarModel {
    public String engine;
    public String wheel;
    public String frame;

    @Override
    public void getEngine() {
        System.out.println(this.engine);
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public void getWheel() {
        System.out.println(this.wheel);
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    @Override
    public void getFrame() {
        System.out.println(this.frame);
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }
}
