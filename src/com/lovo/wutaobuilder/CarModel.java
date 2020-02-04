package com.lovo.wutaobuilder;

public abstract class CarModel {
    //获得引擎
    public abstract void getCarEngine();
    //获得轮子
    public abstract void getCarWheel();
    //获得车架
    public abstract void getCarBody();

    //得到完整的汽车
   final public String  getCar(){
       this.getCarEngine();
       this.getCarWheel();
       this.getCarBody();
        return "获得完整的汽车";
    };

}
