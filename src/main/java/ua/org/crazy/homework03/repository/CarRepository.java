package ua.org.crazy.homework03.repository;

import ua.org.crazy.homework03.entity.Brand;
import ua.org.crazy.homework03.entity.Car;
import ua.org.crazy.homework03.entity.Model;

import java.util.Calendar;
import java.util.Date;

public class CarRepository {
    private Car[] cars;

    public CarRepository(Car[] cars) {
        this.cars = cars;
    }

    public Car getCarById (Long id){
        for (Car car:cars) {
            if (car.getId().equals(id)){
                return car;
            }
        }
        return null;
    }

    public Car[] getCarsByBrand (String brand){
        if (!isBrandInDb(brand)){
            return null;
        }
        Car[] result = createArray();
        int count = 0;
        for (int i = 0; i < cars.length; i++) {
            Brand comparedBrand = Brand.valueOf(brand);
            if (cars[i].getBrand().equals(comparedBrand)){
                result[count] = cars[i];
                count++;
            }
        }
        return trimArray(result);
    }

    private boolean isBrandInDb(String brand) {
        for (Brand el: Brand.values()) {
            if (el.name().equals(brand)){
                return true;
            }
        }
        return false;
    }

    public Car[] getCarsByModel (String model){
        Car[] result = createArray();
        int count = 0;
        for (int i = 0; i < cars.length; i++) {
            Model comparedModel = Model.valueOf(model);
            if (cars[i].getModel().equals(comparedModel)){
                result[count] = cars[i];
                count++;
            }
        }
        return trimArray(result);
    }

    public Car[] getCarsByModelAndByYear (String model, int year){
        Car[] result = createArray();
        int count = 0;
        for (int i = 0; i < cars.length; i++) {
            Model comparedModel = Model.valueOf(model);
            boolean condition = cars[i].getModel().equals(comparedModel) &&
                    (currentYear() - cars[i].getYearOfCarManufacture()) > year;
            if (condition){
                result[count] = cars[i];
                count++;
            }
        }
        if (count == 0) {
            return null;
        }
        return trimArray(result);
    }

    private int currentYear() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.YEAR);
    }

    public Car[] getCarsByYear (int year){
        Car[] result = createArray();
        int count = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getYearOfCarManufacture() == year){
                result[count] = cars[i];
                count++;
            }
        }
        return trimArray(result);
    }

    public Car[] getCarsByYearWhithHighPrice(int year, int price){
        Car[] result = createArray();
        int count = 0;
        for (int i = 0; i < cars.length; i++) {
            boolean condition = (cars[i].getYearOfCarManufacture() == year) && (cars[i].getPrice() > price);
            if (condition){
                result[count] = cars[i];
                count++;
            }
        }
        if (count == 0 ){
            return null;
        }
        return trimArray(result);
    }

    private Car[] createArray() {
        Car[] arr = new Car[cars.length];
    return arr;
    }

    private Car[] trimArray(Car[] cars){
        int count = cars.length;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] == null){
                count = i;
                break;
            }
        }
        Car[] newArr = new Car[count];
        System.arraycopy(cars,0,newArr,0, count);
        return newArr;
    }
}
