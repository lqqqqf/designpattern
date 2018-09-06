/*
 * Copyright (c) 2016-2018. https://github.com/lqqqqf. All rights reserved.
 */

package io.github.lqqqqf.abstractfactory;

public class BmwFactory implements VehicleFactory {
    @Override
    public Bodywork createBodywork() {
        return new BmwBodywork();
    }

    @Override
    public Engine createEngine() {
        return new BmwEngine();
    }
}
