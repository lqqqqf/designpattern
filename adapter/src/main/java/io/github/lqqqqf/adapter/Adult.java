/*
 * Copyright (c) 2016-2018. https://github.com/lqqqqf. All rights reserved.
 */

package io.github.lqqqqf.adapter;

public class Adult {

    private Vehicle vehicle;

    public Adult(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void travel() {
        vehicle.drive();
    }
}
