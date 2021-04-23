package org.example.Database;

import org.example.Datamodel.DTOs.PulseSensorDTO;
import org.example.Datamodel.DTOs.TemperaturesensorDTO;

import java.util.List;

public interface AppointmentAndMeasurementDAO {
    //For implementing to the Database - Use it to
    void saveTemperatureMeasurements(TemperaturesensorDTO temperaturesensorDTO);
    void savePulseMeasurements(PulseSensorDTO pulseSensorDTO);
    void saveAppointment(int PatientID, int AppointmentID);

     List getTemperaturemeasurementsFromAppointment(int PatientID, int AppointmentID);
    List getPulsemeasurementsFromAppointment(int PatientID, int AppointmentID);

}
