class Flight {
    public static void main(String[] args) {
	String  airline1="indigo";
	String  airline2="airindia";
	String  airline3="saudia";
	String  airline4="SpiceJet";
    String  airline5="AirAsia India";
    String  airline6="Vistara";
    String  airline7="Alliance Air";
    String  airline8="Qatar Airways";
	
	String[] world={ airline1,airline2,airline3, airline4, airline5,airline6, airline7};
	for (int i=0;i<world.length;i++)
		 {
			 System.out.println("array value "+i+" is" +world[i]);
		 }
	   world[4]="boeing";
 System.out.println("updated value is "+world[4]);
 System.out.println("\n");
	   
	    System.out.println("\n");
	   
	   for (int i=world.length-1;i>=0;i--)
		  System.out.println(" reversed array value "+i+" is" +world[i]);  
	   
	}
	}