package com.lovo.ybbuilder;

/**
 * 奔驰
 */
public class BenzModel extends CarModel{
    private String YQ;
    private String CL;
    private String CJ;
    private String name = "奔驰";

    @Override
    public void getYQ() {
        System.out.println(YQ);
    }

    @Override
    public void getCL() {
        System.out.println(CL);
    }

    @Override
    public void getCJ() {
        System.out.println(CJ);
    }

    @Override
    public void getName() {
        System.out.println(name);
    }

    public void setYQ(String YQ) {
        this.YQ = YQ;
    }

    public void setCL(String CL) {
        this.CL = CL;
    }

    public void setCJ(String CJ) {
        this.CJ = CJ;
    }

    public void setName(String name) {
        this.name = name;
    }
}
