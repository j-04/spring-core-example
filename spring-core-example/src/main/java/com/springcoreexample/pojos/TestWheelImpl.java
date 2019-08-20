package com.springcoreexample.pojos;

public class TestWheelImpl implements Wheel {
    private String wheelName;

    @Override
    public void setWheelName(String wheelName) {
        this.wheelName = wheelName;
    }

    @Override
    public String getWheelName() {
        return this.wheelName;
    }

    @Override
    public void printWheelName() {
        System.out.println(this.getWheelName());
    }
}
