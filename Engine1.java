class Engine1{
	static int getCCByModel(String modelName)
	{
		System.out.println("Invoking getCCByModel() method in Engine ");
		
		if(modelName!=null)
		{
		System.out.println("Model Name is valid");
		 if(modelName=="Swift")
		 {
			 return 2015;
		 }		
         if(modelName=="Rapid")
		 {
			 return 2014;
		 }	
          if(modelName=="BMW")
		 {
			 return 2018;
		 }	
         if(modelName=="Benz")
		 {
			 return 2010;
		 }		
         if(modelName=="Benz")
		 {
			 return 2020;
		 }	
         if(modelName=="Bently")
		 {			 
			 return 2021;
		 }
		}
		else
		{
			System.err.println("Not valid");
		
		}
		return 1800;
	}
	

}