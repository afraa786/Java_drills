package com.company;
class C1 {
    private int a = 1; //won't execute in the same package, subclass and world
    public int z = 26; // will execute in all
    protected int c = 3; // won't execute in world
    int d = 4; // won't execute in subclass and world
    public void method1 () {
        System.out.println(a);
    }
}
public class accessModifiers {
    public static void main (String [] args) {
         C1 mod = new C1();
         mod.method1();
    }
}