class Park {

    String name;
    String location;
    double areaInAcres;
    int yearEstablished;
    boolean hasPlayground;
    boolean hasPicnicArea;
    boolean hasTrails;
    int numberOfTrees;
    int maximumCapacity;
	
	
	
	Park(String name){
		this.name=name;
		System.out.println("statement 1");
 System.out.println("value of the name ");
	}
	
	Park(String name,String location){
	this(name);
	this.location=location;
	System.out.println("value of the  name ,location");
	System.out.println("statement 2");
	}
	
	Park( String name, String location, double areaInAcres){
	this(name,location);
	this.areaInAcres=areaInAcres;
	System.out.println("value of the  name ,location,areaInAcres");
	System.out.println("statement 3");
	}
	Park(String name, String location, double areaInAcres,int yearEstablished){
	this(name,location,areaInAcres);
	this.yearEstablished=yearEstablished;
	System.out.println("value of the  name ,location,areaInAcres,yearEstablished");
	System.out.println("statement 4");
	}
	Park( String name,String location, double areaInAcres ,int yearEstablished ,boolean hasPlayground){
	this(name,location,areaInAcres,yearEstablished);
	System.out.println("value of the  name ,location,areaInAcres,yearEstablished,hasPlayground");
	this.hasPlayground=hasPlayground;
	System.out.println("statement 5");	
	}
	Park( String name,String location, double areaInAcres, int yearEstablished ,boolean hasPlayground ,boolean hasPicnicArea){
	this(name,location,areaInAcres,yearEstablished,hasPlayground);
	System.out.println("value of the  name ,location,areaInAcres,yearEstablished,hasPlayground,hasPicnicArea");
	this.hasPicnicArea=hasPicnicArea;
	System.out.println("statement 6");
	}
	Park(String name, String location, double areaInAcres ,int yearEstablished, boolean hasPlayground ,boolean hasPicnicArea , boolean hasTrails){
	this(name,location,areaInAcres,yearEstablished,hasPlayground,hasPicnicArea);
	this.hasTrails=hasTrails;
	System.out.println("value of the  name ,location,areaInAcres,yearEstablished,hasPlayground,hasPicnicArea,hasTrails");
	System.out.println("statement 7 ");
	}
	Park( String name,String location, double areaInAcres ,int yearEstablished ,boolean hasPlayground ,boolean hasPicnicArea  ,boolean hasTrails ,int numberOfTrees){
	this(name,location,areaInAcres,yearEstablished,hasPlayground,hasPicnicArea,hasTrails);
	this.numberOfTrees=numberOfTrees;
		System.out.println("value of the  name ,location,areaInAcres,yearEstablished,hasPlayground,hasPicnicArea,hasTrails,numberOfTrees");
	System.out.println("statement 8");}
	Park(String name,String location, double areaInAcres ,int yearEstablished, boolean hasPlayground, boolean hasPicnicArea , boolean hasTrails , int numberOfTrees, int maximumCapacity){
	
	this(name,location,areaInAcres,yearEstablished,hasPlayground,hasPicnicArea,hasTrails,numberOfTrees);
	this.maximumCapacity=maximumCapacity;
	
		System.out.println("value of the  name ,location,areaInAcres,yearEstablished,hasPlayground,hasPicnicArea,hasTrails,numberOfTrees,maximumCapacity");
	System.out.println("statement 9");
	
	
	
	
	}
	}

	
	 