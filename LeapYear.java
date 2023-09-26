import java.util.Scanner;
class LeapYear{
public static void main(String[] args){
	/*
#int year =1900;
boolean leap=false;
if (year %4 ==0)
{
 if (year %100==0)
 {
 if(year %400==0)
 leap=true;
 else
 leap=false;
 }
 else
 leap=false;
 }
 else
	 leap=false;
 if (leap)
 System.out.println(year+"is a leap year");
 else
 System.out.println(year+"is not a lear year");
*/
Scanner sc=new Scanner(System.in);
System.out.println("enter the numeber");
int year=sc.nextInt();

//int year = 2020;

     if (year % 400 == 0)
       System.out.println (year + " is a Leap Year");

     else if (year % 4 == 0 && year % 100 != 0)
       System.out.println (year + "  year is a Leap Year");

     else
         System.out.println (year + " is not a Leap Year");


 }
 }
 