//logic programs
class ParentTest {
   int age = 10;
   public int getAge() {
      age += 25;
      return age;
   }
}
public class Logicalprogram1 {
   // Here we can declare static public void main(String args[])
   static public void main(String args[]) {
     // ParentTest pt = new ParentTest();
      System.out.println("Age is: "+ getAge());
   }
}