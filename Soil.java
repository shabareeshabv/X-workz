public class Soil {
     static String texture="sand";
      static double ph=9.99;
     double organicMatterContent;
     String soilStructure;
	 
	 Soil(double organicMatterContent,String soilStructure)
	 {
		 this.organicMatterContent=organicMatterContent;
		 this.soilStructure=soilStructure;
	 }
	 static void staticdata(){
		 
		 System.out.println("static data value is "+texture);
		 System.out.println("static data value of ph "+ph);
	 }
	 void instancedata(){
		 System.out.println("instancedata is"+organicMatterContent);
		 System.out.println("instancedata is "+soilStructure);
	 }
	
	 public static void main(String[] args)
	 {
		 
		 Soil soilvalue =new Soil(5.36,"granular");
		 Soil soildata =new Soil(4.36,"granular");
		 staticdata();
		 staticdata();
		 soilvalue.instancedata();
		 soildata.instancedata();
		 
		 
		 }
}