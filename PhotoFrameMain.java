class PhotoFrameMain{
public static void main(String[] args)
{

PhotoFrame value1=new PhotoFrame("blue");
System.out.println("start");
System.out.println("color is "+value1.color);
System.out.println("size is "+value1.size);
System.out.println("price is"+value1.price);


PhotoFrame ref=new PhotoFrame("red",15,250);
System.out.println("color is "+ref.color);
System.out.println("size is "+ref.size);
System.out.println("price is "+ref.price);
}
}

