class Vegetable{
public static void main(String[] args){

float tomoto=90.2f;
float pototo=50f;
float beans=50f;
float ladies_finger =60f;
float calabash=45.25f;
float ash_guard=65;
float capsicum=40.80f;
 
 float[] vegename={tomoto,pototo,beans,ladies_finger,calabash,ash_guard,capsicum};
 System.out.println("array in forward direction");
 for( int i=0;i<vegename.length;i++)
 {
 System.out.println("array value"+i+" is"+vegename[i]);
 }
 System.out.println("\n");
 
 
vegename[4]=99.50f;
 System.out.println("updated value is "+vegename[4]);
 System.out.println("\n");
 
 for (int i=vegename.length-1; i>=0;i--)
 { System.out.println(" reversed array value"+i+" is"+vegename[i]);
 }
 

}
}
