class Grocery{
public static void main(String[] args){
 String items1=" salt";
 String items2="sugar";
 String items3="pepper";
 String items4="mooga dal";
 String items5   =" rice";
 String items6  =" conflor";
 String items7  ="apple";
 String[] reference={items1,items2,items3,items4,items5,items6,"wheet flor"};
 //int reference=reference.length;
 System.out.println("forward array value");
for (int i=0;i<reference.length;i++)
 	
{
	System.out.println("index value " +i +"is"+reference[i]);
}
reference[4]="turmeric ";
 System.out.println("updated value is "+vegename[4]);
 System.out.println("\n");
 System.out.println("\n");
 
 System.out.println("reversed array value");
 for (int i=reference.length-1;i>=0;i--)
 {

 System.out.println("index value " +i +"is"+reference[i]);
 }
 
 
}


}                   

