package com.jayr.xplorsqlite;

public class CustomerModel {
    Integer ID;
    String Name;
    Integer Age;
    Boolean isActive;

    public CustomerModel(Integer ID, String name, Integer age, Boolean isActive) {
        this.ID = ID;
        Name = name;
        Age = age;
        this.isActive = isActive;
    }



    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getAge() {
        return Age;
    }



    public void setAge(Integer age) {
        Age = age;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }
    @Override
    public String toString() {
        return "CustomerModel{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", Age=" + Age +
                ", isActive=" + isActive +
                '}';
    }
}
