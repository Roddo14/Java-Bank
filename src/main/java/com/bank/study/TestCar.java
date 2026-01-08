package com.bank.study;

import java.util.HashMap;
import java.util.Map;

public class TestCar {
    public static void main(String[] args) {
        Car car = new Car("00-01-AA",2022);
        Car car2 = new Car("05-07-AB",2021);
        Car car3 = new Car("07-02-GG",2022);

        //inicializar
        Map<String, Car> mapa = new HashMap<>();

        //inserir
        mapa.put(car.getlicencePlate(), car);
        mapa.put(car2.getlicencePlate(), car2);
        mapa.put(car3.getlicencePlate(), car3);

        //buscar
        System.out.println(mapa.get("07-02-GG").getYearOfConstruction());
        System.out.println(car.toCurrentPlate());
    }
}
