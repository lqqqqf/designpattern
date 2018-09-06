package com.kinghom.abstractfacotry;

import com.kinghom.abstractfactory.*;
import static org.junit.Assert.*;
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
    public void testCreateEngine() {
        Engine bmwEngine = bmwFactory.createEngine();
        assertTrue(bmwEngine instanceof BmwEngine);
        Engine benzEngine = benzFactory.createEngine();
        assertTrue(benzEngine instanceof BenzEngine);
    }

    @Test
    public void testCreateBodywork() {
        Bodywork bmwBodywork = bmwFactory.createBodywork();
        assertTrue(bmwBodywork instanceof BmwBodywork);
        Bodywork benzBodywork = benzFactory.createBodywork();
        assertTrue(benzBodywork instanceof BenzBodywork);
    }
}
