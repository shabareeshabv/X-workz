class Brick{
static String color;
String shape;
static int size;
float price ;



Brick(String shape,float price)
{
this.shape=shape;
this.price= price;
}
static void staticvalue(){
System.out.println("static value is "+ color);
System.out.println("static value of size "+size);

}
void instacevalue(){
System.out.println("instance value of shape is"+shape);
System.out.println("instance value of price is "+price);
}
static{
color="reddish";
size=14;

}

public static void main(String[] args)
{
Brick brick1=new Brick( "rectangle",14);
Brick brick2=new Brick( "box ",15);
System.out.println("\n");
System.out.println("\n");
brick1.instacevalue();
staticvalue();
System.out.println("\n");
staticvalue();
System.out.println("\n");
brick2.instacevalue();
}
}

