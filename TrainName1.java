class TrainName1{
	static String getTrainName(int TrainNum)
	{
		System.out.println("Invoking  method in Trainname ");
		
		 if(11013==TrainNum)
		 {
			 return "coimbatore";
		 }		
         if(11014==TrainNum)
		 {
			 return "mumbai express";
		 }	
          if(12013==TrainNum)
		 {
			 return "amritsar express";
		 }	
         if(22691==TrainNum)
		 {
			 return "hazarat nizamuddin express";
		 }		
       
		return "value";
	}
	

}