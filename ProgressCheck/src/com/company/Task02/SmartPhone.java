package com.company.Task02;

public class SmartPhone {
    private int CameraMP;
    private int ProcessorCapacity;
    private String name;

    public SmartPhone(int CameraMp, int ProccesorCapacity, String name) {
        this.CameraMP = CameraMp;
        this.ProcessorCapacity = ProccesorCapacity;
        this.name = name;
    }

    public int getCameraMP() {
        return CameraMP;
    }

    public void setCameraMP(int age) {
        this.CameraMP = age;
    }

    public int getProcessorCapacity() {
        return ProcessorCapacity;
    }

    public void setProcessorCapacity(int power) {
        this.ProcessorCapacity = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "Camera=" + CameraMP +
                ", proc capacity=" + ProcessorCapacity +
                ", name='" + name +
                '}';
    }
}