class WondersOfTheWorld {
    public static void main(String[] args) {
        String wonders1 = "Great Pyramid of Giza";
        String wonders2 =   "Hanging Gardens of Babylon";
        String wonders3 = "Statue of Zeus at Olympia";
        String wonders4 = "Temple of Artemis at Ephesus";
        String wonders5 = "Mausoleum at Halicarnassus";
        String wonders6 =  "Colossus of Rhodes";
        String wonders7 =  "Lighthouse of Alexandria";
         String[] world={ wonders1,wonders2,wonders3,wonders4,wonders5,wonders6,wonders7};
		 for (int i=0;i<world.length;i++)
		 {
			 System.out.println("array value "+i+" is" +world[i]);
		 }
		 
		 System.out.println("\n");
		


		world[0]="taj mahal ";
         System.out.println("updated value is "+world[0]);
         System.out.println("\n");
	   
	    System.out.println("\n");
	   
	    for (int i=world.length-1;i>=0;i--)
		  System.out.println(" reversed array value "+i+" is" +world[i]);  
	   
	   }
	   }
        