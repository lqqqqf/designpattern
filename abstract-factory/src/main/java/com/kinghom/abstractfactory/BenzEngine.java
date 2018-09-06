package com.kinghom.abstractfactory;

public class BenzEngine implements Engine {
    @Override
    public void crank() {
        System.out.println("发动奔驰引擎");
    }
}
