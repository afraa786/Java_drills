import java.util.ArrayList;
public class collectionsFramework {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> bl = new ArrayList<>();
        al.add(4);
        al.add(5);
        al.add(1,7);
        al.add(0);
        al.add(2,3);
        bl.add(56);
        bl.add(41);
        bl.add(37);
        al.addAll(3,bl);
        al.set(5, 566);
        //al.clear();
        System.out.println(bl.contains(57));
        System.out.println(al.indexOf(5));
        int i;
        for (i= 0; i<al.size(); i++) {
            System.out.print(al.get(i));
            System.out.print(", ");
        }
    }
}
