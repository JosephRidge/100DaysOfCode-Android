package com.jayafrique.oopchallenge;

public class Organ {
    String Name;
    String MedicalCondition;
    String Behavior;

    public Organ() {
    }

    public Organ(String name, String medicalCondition, String behavior) {
        this.Name = name;
        this.MedicalCondition = medicalCondition;
        this.Behavior = behavior;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getMedicalCondition() {
        return MedicalCondition;
    }

    public void setMedicalCondition(String medicalCondition) {
        MedicalCondition = medicalCondition;
    }

    public String getBehavior() {
        return Behavior;
    }

    public void setBehavior(String behavior) {
        Behavior = behavior;
    }
}
