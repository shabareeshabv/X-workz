class FabricMain1{
	public static void main(String[] values){
	System.out.println("Invoking main in FabricKiller");
	
	int ref1=Fabric1.getPrice("cotton");
	System.out.println("Ref 1 is:"+ref1);
	int ref2=Fabric1.getPrice("nylon");
	System.out.println("Ref 2 is:"+ref2);
	int ref3=Fabric1.getPrice("woolen");
	System.out.println("Ref 3 is:"+ref3);
	int ref4=Fabric1.getPrice("linen");
	System.out.println("Ref 4 is:"+ref4);
	int ref5=Fabric1.getPrice("polyster");
	System.out.println("Ref 5is:"+ref5);
	int  ref6=Fabric1.getPrice("silk");
	System.out.println("Ref 6is:"+ref6);
	}
}