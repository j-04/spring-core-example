package com.springcoreexample.pojos;

public interface Car {
    void setFrontRightWheel(Wheel wheel);
    void setFrontLeftWheel(Wheel wheel);
    void setRearRightWheel(Wheel wheel);
    void setRearLeftWheel(Wheel wheel);
    void setEngine(Engine engine);
    void setCarName(String carName);

    Wheel getFrontRightWheel();
    Wheel getFrontLeftWheel();
    Wheel getRearRightWheel();
    Wheel getRearLeftWheel();
    Engine getEngine();
    String getCarName();

    void printBeep();
}
