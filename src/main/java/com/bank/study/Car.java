package com.bank.study;

public class Car {
    private String licencePlate;
    private int yearOfConstruction;

    public Car(String licencePlate, int yearOfConstruction) {
        this.licencePlate = licencePlate;
        this.yearOfConstruction = yearOfConstruction;
    }

    public String getlicencePlate() {
        return licencePlate;
    }

    public int getYearOfConstruction() {
        return yearOfConstruction;
    }

    public String toCurrentPlate(){
        if(this.licencePlate.substring(2,3).equals("-")
                && this.licencePlate.substring(5,6).equals("-")){
            return this.licencePlate.substring(0,2) + this.licencePlate.substring(3,5) + this.licencePlate.substring(6,8);
        }
        return null;
    }


}
