public class Main {
    public static void main(String[] args) {
        Watch watch = new Watch("Rolex", "Submariner", 10000, "Leather", true);
        Smartphone smartphone = new Smartphone("Apple", "iPhone 12", 999, 128, true);
        Laptop laptop = new Laptop("Dell", "XPS 15", 1500, 16, "Windows 10");

        watch.displayInfo();
        smartphone.displayInfo();
        laptop.displayInfo();

        System.out.println("Total watches created: " + Watch.getCount());
    }
}
