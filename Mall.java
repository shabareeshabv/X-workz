class Mall {
    String name;       
    String location;   
    int capacity;     
    int numberOfShops; 
    boolean parkingAvailable; 
    double totalArea;
	String area;
    String owner; 
	
	
	
	
	
     Mall( String name){
		 this.name=name;
		 System.out.println("statement 1");
		 
          System.out.println("value of name ");
     }	
	
	 Mall(String name,String location){
		 this(name);
		 this.location=location;
		 	 System.out.println("statement 2");
	 System.out.println("valuer of string and location");
     }
	
	 Mall(String name,String location,int capacity){
		 this(name,location);
		 this.capacity=capacity;
		 System.out.println("statement 3");
	     System.out.println("value of string ,location,capacity ");}
	
	Mall(String name,String location,int capacity,int numberOfShops) 
	{
		this(name,location,capacity);
		this.numberOfShops=numberOfShops;
		System.out.println("statement 4");
	    System.out.println("value of string ,location,capacity");
		
	}
	
	 Mall(String name,String location,int capacity,int numberOfShops,boolean parkingAvailable){
		 this(name,location,capacity,numberOfShops);
		 this.parkingAvailable=parkingAvailable;
		 System.out.println("statement 5");
		 
		 System.out.println("value of string ,location,capacity,numberOfShops");
	 }
	  Mall(String name,String location,int capacity,int numberOfShops,boolean parkingAvailable,double totalArea){
		  this(name,location,capacity,numberOfShops,parkingAvailable);
		  this.totalArea=totalArea;
		  	System.out.println("value of string ,location,capacity,numberOfShops,parkingAvailable,totalArea");
		
	  }
	 Mall(String name,String location,int capacity,int numberOfShops,boolean parkingAvailable,double totalArea,String area){
	    this(name,location,capacity,numberOfShops,parkingAvailable,totalArea);
		this.area=area;
		
		System.out.println("statement 6");
		System.out.println("value of string ,location,capacity,numberOfShops,parkingAvailable,totalArea,area"); 
	 }
	
	 Mall(String name,String location,int capacity,int numberOfShops,boolean parkingAvailable,double totalArea,String area,String owner){
     this(name,location,capacity,numberOfShops,parkingAvailable,totalArea,area);	
     this.owner=owner;
	
	 System.out.println("statement 7");
	 System.out.println("value of string ,location,capacity,numberOfShops,parkingAvailable,totalArea,area,owner");
	 
	 
	 
	 
	 
	 
	 }
	
	}