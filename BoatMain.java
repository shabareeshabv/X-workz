class BoatLauncher {
    public static void main(String[] args) {
        Boat schedule = new Boat();
        System.out.println("\n");
        System.out.println("Invoking main in BoatLauncher");
        System.out.println("Name: " + schedule.name);
        System.out.println("Manufacturer: " + schedule.manufacturer);
        System.out.println("Capacity: " + schedule.capacity);

        System.out.println("\n");

        Boat schedule1 = new Boat("Boat1", "Manufacturer1", 10);
        System.out.println("Boat name: " + schedule1.name);
        System.out.println("Manufacturer: " + schedule1.manufacturer);
        System.out.println("Capacity: " + schedule1.capacity);
    }
}