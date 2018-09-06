/*
 * Copyright (c) 2016-2018. https://github.com/lqqqqf. All rights reserved.
 */

package io.github.lqqqqf.factorymethod;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class VehicleFactoryTest {

    private static VehicleFactory bmwFactory;

    private static VehicleFactory benzFactory;

    @BeforeClass
    public static void setup() {
        bmwFactory = new BmwFactory();
        benzFactory = new BenzFactory();
    }

    @Test
    public void testCreateVehicle() {
        Vehicle bmw = bmwFactory.createVehicle();
        Assert.assertTrue(bmw instanceof Bmw);
        Vehicle benz = benzFactory.createVehicle();
        Assert.assertTrue(benz instanceof Benz);
    }
}
