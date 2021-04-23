package org.example.Datamodel.DTOs;

public abstract class Sensorparent {


    public Sensorparent() {

    }

    public double getSimulatedmax() {
        return simulatedmax;
    }

    public void setSimulatedmax(double simulatedmax) {
        this.simulatedmax = simulatedmax;
    }

    protected double simulatedmax,simulatedmin;

    public String getPortname() {
        return portname;
    }

    public void setPortname(String portname) {
        this.portname = portname;
    }

    protected String portname;

    public Sensorparent(double simulatedMax,double simulatedmin ){
        this.simulatedmax=simulatedMax;
        this.simulatedmin=simulatedmin;


    }

}
