package com.kinghom.factorymethod;

public class BenzFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Benz();
    }
}
