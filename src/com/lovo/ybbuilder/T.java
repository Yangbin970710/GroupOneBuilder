package com.lovo.ybbuilder;

public class T {
    public static void main(String[] args) {
        CarBuilder carBuilder1 = new BenzBuilder();
        String str1 = carBuilder1.buildCarModel("T400","Q69","CNL5583").getCar();
        System.out.println(str1);

        CarBuilder carBuilder2 = new BMWBuilder();
        String str2 = carBuilder2.buildCarModel("T700","O40","GHT359").getCar();
        System.out.println(str2);
    }
}
