/*
 * Copyright (c) 2016-2018. https://github.com/lqqqqf. All rights reserved.
 */

package io.github.lqqqqf.abstractfactory;

public class BmwBodywork implements Bodywork {
    @Override
    public void openDoor() {
        System.out.println("打开弧度45度");
    }

    @Override
    public void closeDoor() {
        System.out.println("容易关");
    }
}
