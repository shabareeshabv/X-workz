import java.util.Scanner;

class Parent{
    int a;
    Parent(int a){
        this.a=a;
    }

    void displaym(){
        System.out.println("parent value"+a);
    }
}

class Child extends Parent{

    int b;
    Child(int a,int b){
        super(a);
        this.b=b;    }
        void displayc(){
            System.out.println("child "+b);
        }

}
public class SuperMethod {
    
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value for 'a': ");
        int a = scanner.nextInt();

        System.out.print("Enter value for 'b': ");
        int b = scanner.nextInt();

        Child child = new Child(a, b);

        child.displaym(); // Display 'a' from the parent class
        child.displayc();  // Display 'b' from the child class

        scanner.close();
    }
}
