package com.question.answer.misc;

public class Hospital {
    private AREA area;
    private int patients;

    public Hospital(AREA area, int patients) {
        this.area = area;
        this.patients = patients;
    }

    public AREA getArea() {
        return area;
    }

    public void setArea(AREA area) {
        this.area = area;
    }

    public int getPatients() {
        return patients;
    }

    public void setPatients(int patients) {
        this.patients = patients;
    }
}