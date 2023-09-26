class Stadium{
 int capacity;
     String field;
     String facilities;
     String seatingArrangement;
     String architecturalStyle;
public  static void main(String args[])
{
Stadium ref=new Stadium();
Stadium value=new Stadium();
System.out.println("ref default value is "+ref.capacity);
System.out.println("ref default value is "+ref.field);
System.out.println("ref default value is "+ref.facilities);
System.out.println("ref default value is "+ref.seatingArrangement);
System.out.println("ref default value is "+ref.architecturalStyle);
System.out.println("\n");
System.out.println("value default value is "+value.capacity);
System.out.println("value default value is "+value.field);
System.out.println("value default value is "+value.facilities);
System.out.println("value default value is "+value.seatingArrangement);
System.out.println("value default value is "+value.architecturalStyle);


ref.capacity=50000;
ref.field="Natural Grass ";
ref.facilities="Parking Lots";
ref.seatingArrangement="Individual Seats";
ref.architecturalStyle="Modern";

value.capacity=25000;
value.field="green grass";
value.facilities="view";
value.seatingArrangement=" Seats";
value.architecturalStyle="latest";
System.out.println("\n");
System.out.println("ref default value is "+ref.capacity);
System.out.println("ref default value is "+ref.field);
System.out.println("ref default value is "+ref.facilities);
System.out.println("ref default value is "+ref.seatingArrangement);
System.out.println("ref default value is "+ref.architecturalStyle);
System.out.println("\n");
System.out.println("value default value is "+value.capacity);
System.out.println("value default value is "+value.field);
System.out.println("value default value is "+value.facilities);
System.out.println("value default value is "+value.seatingArrangement);
System.out.println("value default value is "+value.architecturalStyle);

}
}
