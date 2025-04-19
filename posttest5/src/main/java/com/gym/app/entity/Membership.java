package com.gym.app.entity;

public class Membership {
    private int id;
    private String name;
    private double price;
    private int durationDays;

    public Membership(int id, String name, double price, int durationDays) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.durationDays = durationDays;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getDurationDays() {
        return durationDays;
    }
}
