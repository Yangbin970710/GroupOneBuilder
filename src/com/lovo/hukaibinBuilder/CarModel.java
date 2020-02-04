package com.lovo.hukaibinBuilder;

public abstract class CarModel {
    //获得汽车引擎
    public abstract void getEngine();
    //获得汽车车轮
    public abstract void getWheel();
    //获得汽车车架
    public abstract void getFrame();
    //获得汽车组件
    final public String getCarComponents(){
        this.getEngine();
        this.getWheel();
        this.getFrame();
        return "获得汽车组件";
    }
}
