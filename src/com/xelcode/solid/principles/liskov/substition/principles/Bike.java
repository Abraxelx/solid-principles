package com.xelcode.solid.principles.liskov.substition.principles;

public class Bike extends VehiclesWithoutEngine{
    @Override
    public void price() {
        super.price();
    }

    @Override
    public void numberOfWheels() {
        super.numberOfWheels();
    }

    @Override
    public void model() {
        super.model();
    }

    @Override
    public void pedalType() {
        super.pedalType();
    }
}
