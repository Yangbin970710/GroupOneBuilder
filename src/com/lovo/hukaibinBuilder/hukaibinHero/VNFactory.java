package com.lovo.hukaibinBuilder.hukaibinHero;

public class VNFactory extends BasicFactory {
    @Override
    public Hero createHeroFactory() {
        Hero vn = new VN();
        vn.setName("薇恩");
        vn.setSkill("最强手弩");
        return vn;
    }
}
