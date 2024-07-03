class Base {
    int x;
    Base(int x) {
        this.x = x;
    }
    void display() {
        System.out.println("Base: x = " + x);
    }
}
class Derived extends Base {
    int y;
    Derived(int x, int y) {
        super(x);
        this.y = y;
    }
    @Override
    void display() {
        System.out.println("Derived: x = " + x + ", y = " + y);
    }
}
public class methodOverriding {
    public static void main(String[] args) {
        Base b = new Base(10);
        Derived d = new Derived(20, 30);
        b.display(); // Output: Base: x = 10
        d.display(); // Output: Derived: x = 20, y = 30

        // Using polymorphism
        b = new Derived(40, 50);
        b.display(); // Output: Derived: x = 40, y = 50
    }
}
 //SIMPLIER VERSION OF THE SIMILAR CODE
 class A {
     public int a;
     public int method1() {
         return 4;
     }

     public void method2() {
         System.out.println("I am method 2 of public class A");
     }
 }
class B extends A{
    @Override
    public void method2(){
        System.out.println("I am method 2 of public class B");
    }
}
public class methodOverriding {
    public static void main (String [] args) {
        A a = new A();
        a.method2();
        B b = new B();
        b.method2();
    }
}
