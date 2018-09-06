/*
 * Copyright (c) 2016-2018. https://github.com/lqqqqf. All rights reserved.
 */

package io.github.lqqqqf.abstractfactory;

public class BmwEngine implements Engine {
    @Override
    public void crank() {
        System.out.println("发动宝马引擎!");
    }
}
