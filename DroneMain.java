class DroneMain {
    public static void main(String[] args) {
        double  value = Drone.getDistanceByFlight("DroneXpress", null);
        System.out.println("Drone operator is 1 " + value);

        double value2 = Drone.getDistanceByFlight(null, "Package Delivery");
        System.out.println("Drone event is 2" + value2);
		
		double reference = Drone.getPriceperEvent( "water sprinkler");
		System.out.println("Drone event is 3 " + reference);
		
		 int   discount= Drone.getDiscountByEvent("DroneXpress1", null);
        System.out.println("Drone operator is  1 " + discount);

        int  discount1 = Drone.getDiscountByEvent(null, "Package Delivery1");
        System.out.println("Drone event is 2  " + discount);
		
    }
}