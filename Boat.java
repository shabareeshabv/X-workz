class Boat {
    String name;
    String manufacturer;
    int capacity;

    Boat() {
        System.out.println("Invoking no-args constructor");
        System.out.println("Inside constructor: " + this.name);
        System.out.println("Inside constructor: " + this.manufacturer);
        System.out.println("Inside constructor: " + this.capacity);
    }

    Boat(String name, String manufacturer, int capacity) {
        System.out.println("Invoking constructor by passing parameters");
        this.name = name;
        this.manufacturer = manufacturer;
        this.capacity = capacity;
    }
}