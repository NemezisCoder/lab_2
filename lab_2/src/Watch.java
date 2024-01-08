public class Watch extends Gadget {
    private String strapMaterial;
    private boolean waterproof;

    // Статическая переменная для подсчета созданных часов
    private static int count = 0;

    public Watch(String brand, String model, double price, String strapMaterial, boolean waterproof) {
        super(brand, model, price);
        this.strapMaterial = strapMaterial;
        this.waterproof = waterproof;
        count++; // Увеличиваем счетчик при создании объекта
    }

    // Геттеры и сеттеры
    public String getStrapMaterial() {
        return strapMaterial;
    }

    public void setStrapMaterial(String strapMaterial) {
        this.strapMaterial = strapMaterial;
    }

    public boolean isWaterproof() {
        return waterproof;
    }

    public void setWaterproof(boolean waterproof) {
        this.waterproof = waterproof;
    }

    public static int getCount() {
        return count;
    }

    // Переопределение абстрактного метода
    @Override
    public void displayInfo() {
        System.out.println("Watch: " + getBrand() + " " + getModel() + ", Price: " + getPrice() + ", Strap Material: " + strapMaterial + ", Waterproof: " + waterproof);
    }
}