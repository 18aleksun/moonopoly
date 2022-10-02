package com.company;

public class CitiesDataBase {

    private Cities[] dataBaseCity = {
            new Cities("Москва", 200, 2400, 600, "red"),
            new Cities("Рязань", 180, 2200, 550, "red"),
            new Cities("Пермь", 350, 3500, 240, "blue"),
            new Cities("Санкт-Петербург", 130, 1000, 250, "red"),
            new Cities("Воронеж", 140, 1800, 450, "blue"),
            new Cities("Самара", 240, 1700, 350, "blue")

    };

    public Cities[] getDataBaseCity() {
        return dataBaseCity;
    }

    public void setDataBaseCity(Cities[] dataBaseCity) {
        this.dataBaseCity = dataBaseCity;
    }
}

