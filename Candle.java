class Candle{
static String color;
String scent;
float height;
static String meterial;


Candle(String scent,float height)

{this.scent=scent;
this.height=height;

}
static void staticData(){
System.out.println("Static value of color: " + color);
System.out.println("Static value of meterial: " + meterial);
}
void instanceData(){
System.out.println("Instance value of scent: " + scent);
System.out.println("Instance value of height: " + height);
}

static {
	color="red";
	meterial="wax";
	
}

public static void main(String[] args){
	
 staticData();	
 Candle candle1=new Candle("rose",15.5f);
  Candle candle2=new Candle("value ",11.5f);
 System.out.println("\nInstance data for candle1:");
 candle1.instanceData();

        System.out.println("\nInstance data for candle2:");
        candle2.instanceData();
	
}
}
	
