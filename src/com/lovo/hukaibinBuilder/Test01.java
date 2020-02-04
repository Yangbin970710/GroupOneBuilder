package com.lovo.hukaibinBuilder;

public class Test01 {
    public static void main(String[] args) {
        //奔驰
        CarBuilder benzBuilder = new BenzBuilder();
        String str1 = benzBuilder.buildCarModel("奔驰引擎SS01",
                "奔驰车轮K785","奔驰车架FF776").getCarComponents();
        System.out.println(str1);
        //宝马
        CarBuilder BMWBuilder = new BMWBuilder();
        String str2 = benzBuilder.buildCarModel("宝马引擎77F",
                "宝马轮胎55yy","宝马车架896G").getCarComponents();
        System.out.println(str2);
    }
}
