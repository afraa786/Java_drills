interface Mycamera {
    void takesnap();
    void recordvideo();
    default void resolution () {
System.out.println("recording in 4k");
    }
}
interface mywifi {
    String [] getnetworks();
    void connectToNetwork (String network);
}
class Mysmartphone {
     void callNumber(int phonenumber) {
         System.out.println("calling" + phonenumber);
     }
     void pickcall () {
         System.out.println("Connecting...");
     }
}
class Mycellphone extends Mysmartphone implements mywifi, Mycamera {
public void takesnap() {
    System.out.println("Taking Snap");
}
public void recordvideo() {
    System.out.println("Take a Snap");
}
public String [] getnetworks() {
    System.out.println("Getting list of networks");
    String [] networks = {"FAREED,AFRAA, PRATIMA"};
    return networks;
}
    @Override
    public void connectToNetwork(String networks) {
        System.out.println("Connecting to" + networks);
    }
}
public class defaultclass {
    public static void main (String[] args) {
        Mycellphone IOS = new Mycellphone ();
        String[] arr = IOS.getnetworks();
        for (String network : arr) {
            System.out.println(network);
        }
    }
}
