/*
 * Copyright (c) 2016-2018. https://github.com/lqqqqf. All rights reserved.
 */

package io.github.lqqqqf.factorymethod;

public class BmwFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Bmw();
    }
}
