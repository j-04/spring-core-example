package com.springcoreexample.pojos;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class TestCarImpl implements Car, InitializingBean, DisposableBean {
    private Wheel frontRightWheel;
    private Wheel frontLeftWheel;
    private Wheel rearRightWheel;
    private Wheel rearLeftWheel;
    private Engine engine;
    private String carName;

    public TestCarImpl() {

    }

    public TestCarImpl(Engine engine, Wheel frontRightWheel, Wheel frontLeftWheel, Wheel rearRightWheel, Wheel rearLeftWheel) {
        this.engine = engine;
        this.frontRightWheel = frontRightWheel;
        this.frontLeftWheel = frontLeftWheel;
        this.rearRightWheel = rearRightWheel;
        this.rearLeftWheel = rearLeftWheel;
    }

    @Override
    public void setFrontRightWheel(Wheel wheel) {
        this.frontRightWheel = wheel;
    }

    @Override
    public void setFrontLeftWheel(Wheel wheel) {
        this.frontLeftWheel = wheel;
    }

    @Override
    public void setRearRightWheel(Wheel wheel) {
        this.rearRightWheel = wheel;
    }

    @Override
    public void setRearLeftWheel(Wheel wheel) {
        this.rearLeftWheel = wheel;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setCarName(String carName) {
        this.carName = carName;
    }

    @Override
    public Wheel getFrontRightWheel() {
        return this.frontRightWheel;
    }

    @Override
    public Wheel getFrontLeftWheel() {
        return this.frontLeftWheel;
    }

    @Override
    public Wheel getRearRightWheel() {
        return this.rearRightWheel;
    }

    @Override
    public Wheel getRearLeftWheel() {
        return this.rearLeftWheel;
    }

    @Override
    public Engine getEngine() {
        return this.engine;
    }

    @Override
    public String getCarName() {
        return this.carName;
    }

    public void printBeep() {
        System.out.println("Beeep");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean " + this.carName + " is destroyed!");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean " + this.carName + " is initialized!");
    }

    public void init() {
        System.out.println("Custom bean init method. Bean name: " + this.carName);
    }

    public void delete() {
        System.out.println("Custom bean delete method. Bean name: " + this.carName);
    }
}
