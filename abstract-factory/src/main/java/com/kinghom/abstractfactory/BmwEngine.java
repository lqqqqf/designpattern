package com.kinghom.abstractfactory;

public class BmwEngine implements Engine {
    @Override
    public void crank() {
        System.out.println("发动宝马引擎!");
    }
}
