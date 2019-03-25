package ua.org.crazy.homework03.service;

import ua.org.crazy.homework03.entity.Car;
import ua.org.crazy.homework03.repository.CarRepository;

public class CarService {
    private CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Car getCarById(Long id) {
        return carRepository.getCarById(id);
    }

    public Car[] getCarsByBrand(String brand) {
        return carRepository.getCarsByBrand(brand);
    }

    public Car[] getCarsByModelAndByYear(String model, int year) {
        return carRepository.getCarsByModelAndByYear(model, year);
    }

    public Car[] getCarsByYearWhithHighPrice(int year, int price) {
        return carRepository.getCarsByYearWhithHighPrice(year, price);
    }

    public Car[] getCarsByModel(String model) {
        return carRepository.getCarsByModel(model);
    }

    public Car[] getCarsByYear(int year) {
        return carRepository.getCarsByYear(year);
    }
}
