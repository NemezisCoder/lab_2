public abstract class Gadget {
    private String brand;
    private String model;
    private double price;

    // Конструктор по умолчанию
    public Gadget() {
    }

    // Конструктор с параметрами
    public Gadget(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Абстрактный метод для вывода информации о гаджете
    public abstract void displayInfo();

    // Геттеры и сеттеры
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}