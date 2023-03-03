package web;

public class Car {
    String model;
    int price;
    int year;

    public Car(String model, int price, int year) {
        this.model = model;
        this.price = price;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }
}
