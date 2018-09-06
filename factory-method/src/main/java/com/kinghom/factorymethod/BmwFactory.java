package com.kinghom.factorymethod;

public class BmwFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Bmw();
    }
}
