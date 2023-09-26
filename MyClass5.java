public class MyClass5 {
    private static int staticVariable;
    private int instanceVariable;
    
    public static void staticMethod() {
        // Access static members
        staticVariable = 10;
        // Cannot access instanceVariable directly
        // Cannot call instanceMethod() directly
        System.out.println("Static method called");
    }
    
    public void instanceMethod() {
        // Access both static and instance members
        staticVariable = 20;
        instanceVariable = 30;
        //staticMethod(); // Can call staticMethod()
        System.out.println("Instance method called");
    }
    
    public static void main(String[] args) {
        // Static method called without creating an instance
        MyClass5.staticMethod();
        
        // Instance method called on an instance of MyClass
        MyClass5 myObject = new MyClass5();
		 myObject. instanceVariable=30;
		 System.out.println("number"+ myObject. instanceVariable);
        myObject.instanceMethod();
    }
}