class EngineRunner
{
		public static void main(String[] values){
		System.out.println("invoking main in EngineRunner");
	    int  ref1=Engine1.getCCByModel("Swift");
		System.out.println("Ref 1 is:"+ref1);
		int  ref2=Engine1.getCCByModel("Rapid");
		System.out.println("Ref 2 is:"+ref2);
		int   ref3=Engine1.getCCByModel("BMW");
		System.out.println("Ref 3 is:"+ref3);
		int   ref4=Engine1.getCCByModel("Benz");
		System.out.println("Ref 4 is:"+ref4);
		int   ref5=Engine1.getCCByModel("Audi");
		System.out.println("Ref 5 is:"+ref5);
		int   ref6=Engine1.getCCByModel("Bently");
		System.out.println("Ref 6 is:"+ref6);
		
		}

}					