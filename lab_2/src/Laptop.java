public class Laptop extends Gadget {
    private int ram;
    private String os;

    public Laptop(String brand, String model, double price, int ram, String os) {
        super(brand, model, price);
        this.ram = ram;
        this.os = os;
    }

    // Геттеры и сеттеры
    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    // Переопределение абстрактного метода
    @Override
    public void displayInfo() {
        System.out.println("Laptop: " + getBrand() + " " + getModel() + ", Price: " + getPrice() + ", RAM: " + ram + "GB, OS: " + os);
    }
}