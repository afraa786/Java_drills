interface ParentClass1 {
    void sibling1();
    void sibling2();
}
interface ParentClass2 extends ParentClass1 {
    void sibling3();
    void sibling4();
}
abstract class house implements ParentClass2 {
    public void sibling1() {
        System.out.println("The name of sibling 1 is Mary");
    }
    public void sibling2() {
        System.out.println("The name of sibling 2 is Garry");
    }
}
class Myhouse extends house {
    public void sibling3() {
        System.out.println("The name of sibling 3 is Harry");
    }
    public void sibling4() {
        System.out.println("The name of sibling 4 is Larry");
    }
}
public class Inheritance_in_Interfaces {
    public static void main (String [] args){
    Myhouse family = new Myhouse ();
    family.sibling1();
    family.sibling2();
    family.sibling3();
    family.sibling4();

    }
}
