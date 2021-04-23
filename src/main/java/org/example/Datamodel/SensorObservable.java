package org.example.Datamodel;

public interface SensorObservable extends Runnable {
     public void registerSensorObserver(SensorObserver sensorObserver);



}
