package org.example.Gang11;

import java.util.ArrayList;

public class dataObject {
    //used to contain measurements from an appointment

    private int AppointmentID;
    private ArrayList<Double> values1,values2,values3;

    public ArrayList<Double> getValues1() {
        return values1;
    }

    public void setValues1(ArrayList<Double> values1) {
        this.values1 = values1;
    }

    public ArrayList<Double> getValues2() {
        return values2;
    }

    public void setValues2(ArrayList<Double> values2) {
        this.values2 = values2;
    }

    public ArrayList<Double> getValues3() {
        return values3;
    }

    public void setValues3(ArrayList<Double> values3) {
        this.values3 = values3;
    }

    public int getAppointmentID() {
        return AppointmentID;
    }

    public void setAppointmentID(int appointmentID) {
        AppointmentID = appointmentID;
    }
}
