class Owen {
    static void preheat(int temperature, String unit, String dish) {
        System.out.println("Preheating the oven to " + temperature + " " + unit + " for " + dish + "...");
   
   if( temperature>150){
   System.out.println("cooked properly");}
   else{
	System.out.println("not cooked properly");
      
   }
	}
    static void bake(String dish1, int duration, String temperatureUnit) {
        System.out.println("Baking " + dish + " for " + duration + " minutes at " + duration + " " + temperatureUnit + "...");
		if( duration >40){
		System.out.println("cooked properly");}
		
       else{
         	System.out.println("not cooked properly");
           }

    }

    static void broil(String dish2, int duration, String intensityLevel) {
        System.out.println("Broiling " + dish + " for " + duration + " minutes at " + intensityLevel + " intensity...");
		if(dish2=="steak"){
   System.out.println("cooked properly");
		}
   else{
	System.out.println("not cooked properly");
      }
    }

    static void turnOff() {
        System.out.println("Turning off the oven...");
    }
}

