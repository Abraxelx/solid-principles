package com.xelcode.solid.principles.open.closed.principle;

public class Car extends Vehicle {
    public double calculateValue(){
        return this.calculatePrice() * 0.8;
    }

}
