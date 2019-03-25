package ua.org.crazy.homework03;

import ua.org.crazy.homework03.entity.Car;
import ua.org.crazy.homework03.repository.CarRepository;
import ua.org.crazy.homework03.service.CarService;
import ua.org.crazy.homework03.ui.ConsoleUi;

import static ua.org.crazy.homework03.entity.Brand.*;
import static ua.org.crazy.homework03.entity.Color.*;
import static ua.org.crazy.homework03.entity.Model.*;

public class ConsoleApplication {

    public static final int CARS_NUMBER = 8;

    public static void main(String[] args) {
        Car[] cars = new Car[CARS_NUMBER];
        cars[0] = new Car(84L, HONDA, CRV, 2003, GRAY, 15000, "EW1247KL");
        cars[1] = new Car(3L, HONDA, HRV, 2007, BLACK,17000, "NB1234UI");
        cars[2] = new Car(7L, TOYOTA, COROLLA, 2015, BLACK,25000, "NM9009LK");
        cars[3] = new Car(44L, TOYOTA, RAV4, 2019, GRAY,33000, "QA1111QA");
        cars[4] = new Car(5L, VW, GOLF, 1999, RED,5000, "DF7777DF");
        cars[5] = new Car(121L, VW, TRANSPORTER, 2003, BLUE,7000, "OP8987OP");
        cars[6] = new Car(13L, RENO, DUSTER, 2019, BLACK,23000, "BN3443NB");
        cars[7] = new Car(2L, RENO, LOGAN, 2015, GRAY,8000, "LK1111LK");

        CarRepository carRepository = new CarRepository(cars);

        CarService carService = new CarService(carRepository);

        ConsoleUi consoleUi = new ConsoleUi(carService);

        consoleUi.run();
    }
}
