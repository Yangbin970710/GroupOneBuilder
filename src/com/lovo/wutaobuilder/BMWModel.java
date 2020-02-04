package com.lovo.wutaobuilder;


public class BMWModel extends CarModel {
    public String CarEngine;
    public String CarWheel;
    public String CarBody;

    public void setCarEngine(String carEngine) {
        CarEngine = carEngine;
    }

    public void setCarWheel(String carWheel) {
        CarWheel = carWheel;
    }

    public void setCarBody(String carBody) {
        CarBody = carBody;
    }

    @Override
    public void getCarEngine() {
        System.out.println(CarEngine);
    }

    @Override
    public void getCarWheel() {
        System.out.println(CarWheel);
    }

    @Override
    public void getCarBody() {
        System.out.println(CarBody);
    }
}
