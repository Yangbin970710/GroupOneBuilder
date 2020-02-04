package com.lovo.hukaibinBuilder.hukaibinHero;

public class MMFactory extends BasicFactory {
    @Override
    public Hero createHeroFactory() {
        Hero mm = new MM();
        mm.setName("阿木木");
        mm.setSkill("绷带缠绕");
        return mm;
    }
}
