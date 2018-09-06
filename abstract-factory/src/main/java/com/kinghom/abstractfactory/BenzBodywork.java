package com.kinghom.abstractfactory;

public class BenzBodywork implements Bodywork {
    @Override
    public void openDoor() {
        System.out.println("打开弧度40度");
    }

    @Override
    public void closeDoor() {
        System.out.println("关门声音小");
    }
}
