
 
class Drone {
    static double  getDistanceByFlight(String operator, String event) {
        if (operator != null && event != null) {
            if (operator==("DroneXpress")) {
				System.out.println("String value is operator 1");
                return 15.65;
            }
        }

       
            if (event==("Package Delivery")) {
				System.out.println("String value is event2");
                return 0.25;
            }
        

        return 7.652;
    }
	
	
	 static double  getPriceperEvent(String eventname){
		 if (eventname!= null) {
            if (eventname==(" water sprinkler")) {
				System.out.println("String value is eventname 3");
                return 45.5;
            }
        }return 1005.36;
		 
	 }
	
	static int getDiscountByEvent(String eventName, String refperson) {
        if (eventName != null && refperson != null) {
            if (eventName=="DroneXpress1") {
				System.out.println("String value is eventName");
                return 25;
            }
        }

      
            if (refperson==("Package Delivery1")) {
				System.out.println("String value is refperson");
                return 56;
            }
        

        return 97;
    }
	
	
}