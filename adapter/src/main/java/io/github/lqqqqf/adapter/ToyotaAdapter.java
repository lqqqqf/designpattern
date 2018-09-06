/*
 * Copyright (c) 2016-2018. https://github.com/lqqqqf. All rights reserved.
 */

package io.github.lqqqqf.adapter;

public class ToyotaAdapter implements Vehicle {

    private Toyota toyota;

    public ToyotaAdapter(Toyota toyota) {
        this.toyota = toyota;
    }

    @Override
    public void drive() {
        toyota.run();
    }
}
