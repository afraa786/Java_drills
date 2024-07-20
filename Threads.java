class MyThread extends Thread {
    private String threadName;
    public MyThread(String name) {
        super(name);
        this.threadName = name;
    }
    public void run() {
        super.run();
        System.out.println();
        System.out.println(threadName + " is running.");
    }
    public void number(int a) {
        System.out.println("Number\t" + a);
    }
    public void printThreadName() {
        System.out.println("Thread name from superclass: " + super.getName());
    }
}
public class Threads {
    public static void main(String[] args) {
        int [] arr ={1, 2, 3};
        try {
            System.out.println(arr[4]);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("exception caught"   + e);
        }
        MyThread thr = new MyThread("Afraa");
        thr.start();
        thr.printThreadName();
        thr.number(5);
    }
}