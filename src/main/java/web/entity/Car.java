package web.entity;

public class Car {
    String model;
    int price;
    int year;

    public Car(String model, int price, int year) {
        this.model = model;
        this.price = price;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
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
