/*
 * Copyright (c) 2016-2018. https://github.com/lqqqqf. All rights reserved.
 */

package io.github.lqqqqf.abstractfactory;

public class BenzFactory implements VehicleFactory {
    @Override
    public Bodywork createBodywork() {
        return new BenzBodywork();
    }

    @Override
    public Engine createEngine() {
        return new BenzEngine();
    }
}
