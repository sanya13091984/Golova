package ru.Alex.Vil.services;

import ru.Alex.Vil.models.Car;

import java.util.List;

public interface CarService {

    Iterable<Car> getCars();

    Car postCar(Car car);

    Car putCar(Car car);

    String delCar(Integer id);

    List<Car> getCar(String marka);
}
