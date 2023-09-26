class WirelessController {
    int batteryLevel;
    String controllerType;
    String connectivity;
    String buttons;
    String ergonomicDesign;

    public  static void main(String args[]) {
        WirelessController xboxController = new WirelessController();
        WirelessController playstationController = new WirelessController();

        System.out.println("xboxController default battery level: " + xboxController.batteryLevel);
        System.out.println("xboxController default controller type: " + xboxController.controllerType);
        System.out.println("xboxController default connectivity: " + xboxController.connectivity);
        System.out.println("xboxController default buttons: " + xboxController.buttons);
        System.out.println("xboxController default ergonomic design: " + xboxController.ergonomicDesign);
        System.out.println("\n");

        System.out.println("playstationController default battery level: " + playstationController.batteryLevel);
        System.out.println("playstationController default controller type: " + playstationController.controllerType);
        System.out.println("playstationController default connectivity: " + playstationController.connectivity);
        System.out.println("playstationController default buttons: " + playstationController.buttons);
        System.out.println("\n");

        xboxController.batteryLevel = 80;
        xboxController.controllerType = "Xbox";
        xboxController.connectivity = "Wireless";
        xboxController.buttons = "A, B, X, Y, D-pad";
        xboxController.ergonomicDesign = "Comfortable grip";

        playstationController.batteryLevel = 70;
        playstationController.controllerType = "PlayStation";
        playstationController.connectivity = "Bluetooth";
        playstationController.buttons = "Triangle, Circle, X, Square, D-pad";
        playstationController.ergonomicDesign = "Sleek and streamlined";

        System.out.println("xboxController updated battery level: " + xboxController.batteryLevel);
        System.out.println("xboxController updated controller type: " + xboxController.controllerType);
        System.out.println("xboxController updated connectivity: " + xboxController.connectivity);
        System.out.println("xboxController updated buttons: " + xboxController.buttons);
        System.out.println("xboxController updated ergonomic design: " + xboxController.ergonomicDesign);
        System.out.println();

        System.out.println("playstationController updated battery level: " + playstationController.batteryLevel);
        System.out.println("playstationController updated controller type: " + playstationController.controllerType);
        System.out.println("playstationController updated connectivity: " + playstationController.connectivity);
        System.out.println("playstationController updated buttons: " + playstationController.buttons);
        System.out.println("playstationController updated ergonomic design: " + playstationController.ergonomicDesign);
    }
}
