package org.example.Datamodel;

import org.example.Datamodel.DTOs.Sensorparent;

public interface SensorObserver {
    void notify(Sensorparent sensorDTO);
}
