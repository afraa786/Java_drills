class Base1 {
    Base1() {
        System.out.println("I am a constructor");
    }
    Base1(int a) {
        System.out.println("I am a constructor with the value of a as:" + a);
    }
}
class Derived1 extends Base1 { //derived1 is a subclass of base1
    Derived1() {
     //  super(7); //calling the superclass constructor or a keyword used to refer immediate parent class
        System.out.println("I am a derived class contructor");
    }
    Derived1 (int a, int b) {
        System.out.println("I am overloading constructor of derived value of b as:" + b);
    }
}
public class inheritance {
    public static void main(String [] args) {
        Derived1 d = new Derived1(4,5);
        // System.out.println(d); //memory location
    }
}
