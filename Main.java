/*class Main{
public static void main(String[] args){
	//  using for loop to print the array elements
int[] age ={12,4,5};
System.out.println("using for loop");
for( int i=0;i<age.length;i++){
System.out.println(age[i]);
}
}
}

*/
class Main{
public static void main(String[] args){
int[] numbers={1,5,4,7,8,4,5,-2,5,4};
int sum=0;
//int number=0;

//for( int i=0;i<numbers.length;i++)
for (int number:numbers)
{
	  sum += numbers[i];
}
System.out.println("Sum = " + sum);}
}

// program for sum of aray
/*public class Main {
  public static void main(String[] args) {
    int[] numbers = {1, 5, 4, 7, 8, 4, 5, -2, 5, 4};
    int sum = 0;

    for (int i = 0; i < numbers.length; i++) {
      sum += numbers[i];
    }

    System.out.println("Sum = " + sum);
}}*/