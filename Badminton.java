class Badminton{
    int playerCount;
    String shuttlecockType;
    String courtType;
    String equipment;
    String gameFormat;
public static void main(String args[])
{
Badminton match1=new Badminton();
Badminton match2=new Badminton();
System.out.println("ref default value is "+match1.playerCount);
System.out.println("ref default value is "+match1.shuttlecockType);
System.out.println("ref default value is "+match1.courtType);
System.out.println("ref default value is "+match1.equipment);
System.out.println("ref default value is "+match1.gameFormat);
System.out.println("\n");
System.out.println("match2 default value is "+match2.playerCount);
System.out.println("match2 default value is "+match2.shuttlecockType);
System.out.println("match2 default value is "+match2.courtType);
System.out.println("match2 default value is "+match2.equipment);
System.out.println("match2 default value is "+match2.gameFormat);


match1.playerCount=2;
match1.shuttlecockType="Feather" ;
match1.courtType="Indoor";
match1.equipment="Rackets and Net";
match1.gameFormat="Singles";

match2.playerCount=2;
match2.shuttlecockType="Feather";
match2.courtType="outdoor";
match2.equipment=" Rackets and Net";
match2.gameFormat="double";
System.out.println("\n");
System.out.println("match1  value is "+match1.playerCount);
System.out.println("match1  value is "+match1.shuttlecockType);
System.out.println("match1  value is "+match1.courtType);
System.out.println("match1  value is "+match1.equipment);
System.out.println("match1  value is "+match1.gameFormat);
System.out.println("\n");
System.out.println("match2  value is "+match2.playerCount);
System.out.println("match2  value is "+match2.shuttlecockType);
System.out.println("match2  value is "+match2.courtType);
System.out.println("match2  value is "+match2.equipment);
System.out.println("match2  value is "+match2.gameFormat);

}
}
