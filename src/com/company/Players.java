package com.company;

import java.util.List;

public class Players {
    private String name;
    private int balance = 0;
    private int field = 0;
    private List<Cities> listCitiesOfPlayer;



    public Players(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getField() {
        return field;
    }

    public void setField(int field) {
        this.field = field;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
