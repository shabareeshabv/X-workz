class  Job{
 static void apply()
 { System.out.println("start the methods");
   String variable ="shabareesha";
   System.out.println(" person name is :"+variable);
   
 }
 static void apply(String personName,int exp)
 {
 System.out.println( "person name and exp \n "+personName   +exp);
}
static void apply(String personName,int exp,String refName)
{
	System.out.println(" personName and exp add refName" + personName+ exp+refName);
	
}
static void apply(int exp)
{ System.out.println("value of exp is"+exp);
}
static void rejectoffer()
{
String rejectedName="your";
System.out.println("  rejected your offer"+rejectedName);
}
}
 