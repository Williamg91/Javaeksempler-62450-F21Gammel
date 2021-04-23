package org.example.Datamodel.DataGenerators;

import org.example.Datamodel.DTOs.Sensorparent;
import org.example.Datamodel.DTOs.TemperaturesensorDTO;
import org.example.Datamodel.SensorObservable;
import org.example.Datamodel.SensorObserver;

import java.util.ArrayList;

public class TemperaturSensorDataGenerator implements SensorObservable {

    //We made it implement the Observable so we can have more than one type of data, and others observe
    //the data being created.


    private SensorObserver sensorObserver;
    double temperatureMax;

    public double getTemperatureMax() {
        return temperatureMax;
    }

    public void setTemperatureMax(double temperatureMax) {
        this.temperatureMax = temperatureMax;
    }

    public double getTemperatureMin() {
        return temperatureMin;
    }

    public void setTemperatureMin(double temperatureMin) {
        this.temperatureMin = temperatureMin;
    }

    double temperatureMin;
    public TemperaturSensorDataGenerator(double temperatureMax,double temperatureMin){
this.temperatureMax=temperatureMax;
this.temperatureMin=temperatureMin;

    }


    @Override
    public void registerSensorObserver(SensorObserver sensorObserver) {
        this.sensorObserver=sensorObserver;
        //if something happens to the sensor, such as new data being available, we want to tell!

    }

    public void invertRunning() {
        isRunning = !isRunning;
        // stop that shit :)
    }

    boolean isRunning=true;
    @Override
    public void run() {
        while(isRunning){
            TemperaturesensorDTO temperaturesensorDTO = new TemperaturesensorDTO(temperatureMin,temperatureMax);

            if(sensorObserver!=null){
                sensorObserver.notify();

            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }



    }
}
