package ua.org.crazy.homework03.entity;

public class Car {
    private Long id;
    private Enum<Brand> brand;
    private Enum<Model> model;
    private int yearOfCarManufacture;
    private Enum<Color> color;
    private int price;
    private String registrationNumber;

    public Car() {
    }

    public Car(Long id, Enum<Brand> brand, Enum<Model> model, int yearOfCarManufacture, Enum<Color> color, int price, String registrationNumber) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.yearOfCarManufacture = yearOfCarManufacture;
        this.color = color;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    public Car(Long id, Enum<Brand> brand, Enum<Model> model, int yearOfCarManufacture, Enum<Color> color) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.yearOfCarManufacture = yearOfCarManufacture;
        this.color = color;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Enum<Brand> getBrand() {
        return brand;
    }

    public void setBrand(Enum<Brand> brand) {
        this.brand = brand;
    }

    public Enum<Model> getModel() {
        return model;
    }

    public void setModel(Enum<Model> model) {
        this.model = model;
    }

    public int getYearOfCarManufacture() {
        return yearOfCarManufacture;
    }

    public void setYearOfCarManufacture(int yearOfCarManufacture) {
        this.yearOfCarManufacture = yearOfCarManufacture;
    }

    public Enum<Color> getColor() {
        return color;
    }

    public void setColor(Enum<Color> color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }


    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand=" + brand +
                ", model=" + model +
                ", yearOfCarManufacture=" + yearOfCarManufacture +
                ", color=" + color +
                ", price=" + price +
                ", registrationNumber='" + registrationNumber + '\'' +
                '}';
    }

    public static void printCars(Car[] cars){
        for (Car car: cars) {
            System.out.println(car);
        }
    }
}
