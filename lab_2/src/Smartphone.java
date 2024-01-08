public class Smartphone extends Gadget {
    private int memory;
    private boolean has5G;

    public Smartphone(String brand, String model, double price, int memory, boolean has5G) {
        super(brand, model, price);
        this.memory = memory;
        this.has5G = has5G;
    }

    // Геттеры и сеттеры
    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public boolean isHas5G() {
        return has5G;
    }

    public void setHas5G(boolean has5G) {
        this.has5G = has5G;
    }

    // Переопределение абстрактного метода
    @Override
    public void displayInfo() {
        System.out.println("Smartphone: " + getBrand() + " " + getModel() + ", Price: " + getPrice() + ", Memory: " + memory + "GB, 5G: " + has5G);
    }
}