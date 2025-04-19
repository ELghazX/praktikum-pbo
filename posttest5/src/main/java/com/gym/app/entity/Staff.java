package com.gym.app.entity;

public class Staff extends User {
    private String shift;

    @Override
    public String getInfo() {
        return "Staff: " + name + ", Shift: " + shift;
    }

    public Staff(int id, String name, String password, String shift) {
        super(id, name, password, "staff");
        this.shift = shift;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }
}
