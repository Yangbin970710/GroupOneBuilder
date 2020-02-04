package com.lovo.hukaibinBuilder.hukaibinHero;

public abstract class Hero {
    public String name;

    public String skill;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
