class TubelightLauncher {
    public static void main(String[] args) {
        Tubelight tubelight1 = new Tubelight();
        System.out.println("\n");
        System.out.println("Invoking main in TubelightLauncher");
        System.out.println("Brand: " + tubelight1.brand);
        System.out.println("Wattage: " + tubelight1.wattage);
        System.out.println("Is On: " + tubelight1.isOn);

        System.out.println("\n");
 
        Tubelight tubelight2 = new Tubelight("ABC", 40, true);
        System.out.println("Brand: " + tubelight2.brand);
        System.out.println("Wattage: " + tubelight2.wattage);
        System.out.println("Is On: " + tubelight2.isOn);
    }
}