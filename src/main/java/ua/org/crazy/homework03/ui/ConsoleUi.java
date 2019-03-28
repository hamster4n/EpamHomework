package ua.org.crazy.homework03.ui;

import ua.org.crazy.homework03.entity.Car;
import ua.org.crazy.homework03.service.CarService;

import java.util.Scanner;

public class ConsoleUi {
    private CarService carService;
    private Scanner scanner;

    public ConsoleUi(CarService carService) {
        this.carService = carService;
        this.scanner = new Scanner(System.in);
    }

    public void run(){
        while (true){
            init();
        }
    }

    private void init() {
        helloMessage();
        String choice = getChoiceOneChar();
        switch (choice){
            case "b": {
                runMethodGetCarsByBrand();
                break;
            }
            case "m":{
                runMethodGetCarsByModelAndByYear();
                break;
            }
            case "p":{
                runMethodGetCarsByYearWhithHighPrice();
                break;
            }
            case "x":{
                System.out.println("Thank you for using the program. Goodbye.");
                System.exit(0);
            }
            default:{
                System.out.println("You input wrong choice!");
            }
        }
    }

    private void runMethodGetCarsByYearWhithHighPrice() {
        System.out.println("Input year of car manufacture (it must be int!)");
        int year = getChoiceOneInt();
        System.out.println("Input price");
        int price = getChoiceOneInt();
        Car[] cars = carService.getCarsByYearWhithHighPrice(year, price);
        if (cars==null){
            System.out.println("We don't have the right cars!");
        } Car.printCars(cars);
    }

    private void runMethodGetCarsByModelAndByYear() {
        System.out.println("Input car model (choose one: CRV, HRV, RAV4, COROLLA, GOLF, TRANSPORTER, DUSTER, LOGAN)");
        String model = getChoiceOneWord().toUpperCase();
        System.out.println("Input age of car (it must be number!)");
        int age = getChoiceOneInt();
        Car[] cars = carService.getCarsByModelAndByYear(model, age);
        if (cars == null){
            System.out.println("We don't have the right cars!");
        } else {
            Car.printCars(cars);
        }
    }


    private void runMethodGetCarsByBrand() {
        System.out.println("Input car brand (choose one: HONDA, TOYOTA, VW, RENO)");
        String brand = getChoiceOneWord().toUpperCase();
        Car[] cars = carService.getCarsByBrand(brand);
        if (cars == null){
            System.out.println("We don`t have the right brand!");
        } else {
            Car.printCars(cars);
        }
    }

    private int getChoiceOneInt() {
        return scanner.nextInt();
    }

    private String getChoiceOneWord() {
        return scanner.next();
    }

    private String getChoiceOneChar() {
        return String.valueOf(scanner.next().trim().charAt(0));
    }

    private void helloMessage() {
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Please input char to choose function.");
        System.out.println("b - list of cars of a given brand");
        System.out.println("m - list of cars of a given model, which are operated by above n years");
        System.out.println("p - list of cars of a given year, the price of which is higher than the specified");
        System.out.println("x - exit");
    }
}
