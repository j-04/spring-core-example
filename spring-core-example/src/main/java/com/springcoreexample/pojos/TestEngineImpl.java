package com.springcoreexample.pojos;

public class TestEngineImpl implements Engine {
    private String engineName;

    @Override
    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    @Override
    public String getEngineName() {
        return this.engineName;
    }

    @Override
    public void printEngineName() {
        System.out.println(this.getEngineName());
    }
}
