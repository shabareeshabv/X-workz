import java.util.Scanner;
class SumNatural
{
public static void main(String[] args)
{
	System.out.println("enter the number");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
//int num=100;
int sum=0;
for (int i=1;i<=num;i++)
{
            // sum = sum + i;
            sum += i;
        }

        System.out.println("Sum = " + sum);
    }
}