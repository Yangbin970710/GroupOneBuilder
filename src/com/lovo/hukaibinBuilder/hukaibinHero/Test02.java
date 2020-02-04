package com.lovo.hukaibinBuilder.hukaibinHero;

public class Test02 {
    public static void main(String[] args) {
        //薇恩
        BasicFactory basicFactory1 = new VNFactory();
        Hero hero1 = basicFactory1.createHeroFactory();
        System.out.println(hero1.getName() + "/" + hero1.getSkill());
        //阿木木
        BasicFactory basicFactory2 = new MMFactory();
        Hero hero2 = basicFactory2.createHeroFactory();
        System.out.println(hero2.getName() + "/" + hero2.getSkill());
    }
}
