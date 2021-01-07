package com.jayafrique.oopchallenge;

public class Heart extends Organ{
    Integer HeartRate;

    public Heart(Integer heartRate) {
        HeartRate = heartRate;
    }

    public Heart(String name, String medicalCondition, String behavior) {
        super(name, medicalCondition, behavior);

    }

    public Integer getHeartRate() {
        return HeartRate;
    }

    public void setHeartRate(Integer heartRate) {
        HeartRate = heartRate;
    }
}
