package com.lovo.wutaobuilder;

public class Test {
    public static void main(String[] args) {
//        //奔驰
//        CarBuilder BenzBuilder = new BenzBuilder();
//        String str  = BenzBuilder.createCarModel("奔驰100","奔驰轮子","奔驰车体").getCar();
//        System.out.println(str);

        //宝马
        CarBuilder BMWBuilder = new BenzBuilder();
        String s  = BMWBuilder.createCarModel("宝马100","宝马轮子","宝马车体").getCar();
        System.out.println(s);
    }
}
