class Tubelight {
    String brand;
    int wattage;
    boolean isOn;

    Tubelight() {
        System.out.println("Invoking no-args constructor");
        System.out.println("Inside constructor: " + this.brand);
        System.out.println("Inside constructor: " + this.wattage);
        System.out.println("Inside constructor: " + this.isOn);
    }

    Tubelight(String brand, int wattage, boolean isOn) {
        System.out.println("Invoking constructor by passing parameters");
        this.brand = brand;
        this.wattage = wattage;
        this.isOn = isOn;
    }
}
