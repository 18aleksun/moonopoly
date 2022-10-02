package com.company;

public class Cities {
    private String name;
    private int payment;
    private int cost;
    private int moneyForHome;
    private int tageOnField = 0;

    private String color;

    public Cities(String name, int payment, int cost, int moneyForHome, String color) {
        this.name = name;
        this.payment = payment;
        this.cost = cost;
        this.moneyForHome = moneyForHome;
    }

    public String getName() {
        return name;
    }
}
