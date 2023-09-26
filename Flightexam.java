class Flightexam{
public static void main (String[] args){
String value1=" boieg1";
String value2=" boieg2";
String value3=" boieg3";
String value4=" boieg4";
String value5=" boieg5";
String value6=" boieg6";
String value7=" boieg7";
String value8=" boieg8";
String value9=" boieg9";
String value10=" boieg10";
String value11=" boieg11";
String value12=" boieg12";
String value13=" boieg13";

String[] ref={value1,value2,value3,value4,value5,value6,value7,value8,value9,value10,value11,value12,value13};
int ref1=ref.length;
for (int i=0; i<ref1;i++)
{ System.out.println("value is forwarded"+ref[i]);
}
 ref[3]="boeig5555555555";
 System.out.println("updated value is "+ref[3]);

for (int i=ref1-1;i>=0;i--)
{
	System.out.println("reversed value is"+ref[i]);
	

}
}}