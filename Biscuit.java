class Biscuit{
public static void main(String[] args){
String   biscuit1="parle g";
String   biscuit2="happy happy";
String   biscuit3="Marie Gold";
String   biscuit4="Marie veeta";
String   biscuit5="Monaco";
String   biscuit6="Krack jack";



String   biscuit7="nutri crunch";
String[] value={biscuit1,biscuit2,biscuit3,biscuit4,biscuit5,biscuit6,biscuit7};
int  number=value.length;
for (int i=0;i<number;i++)
{
System.out.println("index value " +i +"is"+value[i]);
}
System.out.println("\n");

value[4]="50 50 ";
 System.out.println("updated value is "+value [4]);
 System.out.println("\n");

 for (int i=number-1;i>=0;i--)
 {System.out.println(" reversed index value " +i +"is"+value[i]);
 }



}
}