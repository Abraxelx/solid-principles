package com.xelcode.solid.principles.liskov.substition.principles;

public class Car extends VehiclesWithEngine{
    @Override
    public void price() {
        super.price();
    }

    @Override
    public void engineType() {
        super.engineType();
    }

    @Override
    public void numberOfWheels() {
        super.numberOfWheels();
    }

    @Override
    public void model() {
        super.model();
    }
}
