import  java.io.FileOutputStream;
import  java.io.ObjectOutputStream;
import  java.io.FileNotFoundException;
import  java.io.IOException;

class Student implements java.io. Serializable{
	int sid=101;
	String sname="ram";
	int sage=29;
	double  sfee=2500;
	String scurce="java";
	String insName="sdm";
}
class SandD{
public static void main(String[] args)
throws FileNotFoundException,IOException
{
 FileOutputStream fos=new  FileOutputStream("des");
  ObjectOutputStream oos=new ObjectOutputStream(fos);
 Student s=new Student();
 oos.writeObject(s);
}
}
