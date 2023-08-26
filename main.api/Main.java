// Step 1: Create class A with method meth
class A {
    public String meth() {
        return "Invoking method from class A";
    }
}

// Step 2: Create class B which extends class A
class B extends A {
    // Class B inherits the meth() method from class A

    // Step 4: Override methode meth in class B
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}

// Step 3 and 5: Create object of class B and call methods
public class Main {
    public static void main(String[] args) {
        B objB = new B();

        // Step 3: Call the meth method from class A
        System.out.println(objB.meth()); // Output: Method is overridden in Extended class B
    }
}
