package com.lovo.ybbuilder;

/**
 * 汽车
 */
public abstract class CarModel {
    public abstract void getYQ();

    public abstract void getCL();

    public abstract void getCJ();

    public abstract void getName();

    final public String getCar(){
        this.getYQ();
        this.getCL();
        this.getCJ();
        this.getName();
        return "汽车";
    }
}
