class PowerBank {
    int batteryCapacity;
    String brand;
    String connectivity;
    String chargingPorts;
    String size;

    public  static void main(String args[]) {
        PowerBank miPowerBank = new PowerBank();
        PowerBank ankerPowerBank = new PowerBank();

        System.out.println("miPowerBank default battery capacity: " + miPowerBank.batteryCapacity);
        System.out.println("miPowerBank default brand: " + miPowerBank.brand);
        System.out.println("miPowerBank default connectivity: " + miPowerBank.connectivity);
        System.out.println("miPowerBank default charging ports: " + miPowerBank.chargingPorts);
        System.out.println("miPowerBank default size: " + miPowerBank.size);
        System.out.println();

        System.out.println("ankerPowerBank default battery capacity: " + ankerPowerBank.batteryCapacity);
        System.out.println("ankerPowerBank default brand: " + ankerPowerBank.brand);
        System.out.println("ankerPowerBank default connectivity: " + ankerPowerBank.connectivity);
        System.out.println("ankerPowerBank default charging ports: " + ankerPowerBank.chargingPorts);
        System.out.println("ankerPowerBank default size: " + ankerPowerBank.size);
         System.out.println("\n");
        miPowerBank.batteryCapacity = 20000;
        miPowerBank.brand = "Mi";
        miPowerBank.connectivity = "USB";
        miPowerBank.chargingPorts = "2 USB-A, 1 USB-C";
        miPowerBank.size = "Small and compact";

        ankerPowerBank.batteryCapacity = 26800;
        ankerPowerBank.brand = "Anker";
        ankerPowerBank.connectivity = "USB";
        ankerPowerBank.chargingPorts = "3 USB-A";
        ankerPowerBank.size = "Medium-sized";

        System.out.println("miPowerBank updated battery capacity: " + miPowerBank.batteryCapacity);
        System.out.println("miPowerBank updated brand: " + miPowerBank.brand);
        System.out.println("miPowerBank updated connectivity: " + miPowerBank.connectivity);
        System.out.println("miPowerBank updated charging ports: " + miPowerBank.chargingPorts);
        System.out.println("miPowerBank updated size: " + miPowerBank.size);
   System.out.println("\n");

        System.out.println("ankerPowerBank updated battery capacity: " + ankerPowerBank.batteryCapacity);
        System.out.println("ankerPowerBank updated brand: " + ankerPowerBank.brand);
        System.out.println("ankerPowerBank updated connectivity: " + ankerPowerBank.connectivity);
        System.out.println("ankerPowerBank updated charging ports: " + ankerPowerBank.chargingPorts);
        System.out.println("ankerPowerBank updated size: " + ankerPowerBank.size);
    }
}
