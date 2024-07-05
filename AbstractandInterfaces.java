//import java.util.Scanner;
//class Cylinder{
//        int r;
//        int h;
//        double calculatearea() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter radius of the cylinder:");
//        r = sc.nextInt();
//        System.out.println("Enter height of the Cylinder");
//        h= sc.nextInt();
//        return 2* Math.PI *r* h* + 2*Math.PI* r *r;
//    }
//}
//public class AbstractandInterfaces {
//    public static void main (String [] args) {
//        Cylinder cylinder = new Cylinder();
//        double area = cylinder.calculatearea();
//        System.out.println("area of the cylinder is" + area);
//    }
//}
interface bicycle {
    void applybreak();
    void Speedup ();
}
class porchebicycle implements bicycle {
    void dodge() {
        System.out.println("the bicycle has travelled 12Km");
    }
    @Override
    public void applybreak() {
        System.out.println("the bicycle is in rest");
    }
    @Override
    public void Speedup(){
        System.out.println("the bicycle is in acceleration");
    }
}
public class AbstractandInterfaces {
    public static void main (String [] args) {
        porchebicycle bike = new porchebicycle();
        bike.dodge();
        bike.applybreak();
        bike.Speedup();

    }
}