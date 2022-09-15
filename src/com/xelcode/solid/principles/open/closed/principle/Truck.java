package com.xelcode.solid.principles.open.closed.principle;


public class Truck extends Vehicle {
    public double calculateValue(){
        return this.calculatePrice() * 2;
    }
}
