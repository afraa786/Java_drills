//example 1
class Mythread extends Thread {
    private String threadName;
    public Mythread(String name) {
        super(name);
        this.threadName = name;
    }
    @Override
    public void run() {
        System.out.println(threadName + " is running.");
    }
    public void printThreadName() {
        System.out.println("Thread name from superclass: " + super.getName());
    }
}
    public class ThreadMethods {
    public static void main(String[] args) {
        MyThread myThread = new MyThread("Afraa");
        myThread.start();
        myThread.printThreadName();
    }
}
//example 2
class RunnableThreads extends Thread {
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Thread.sleep(100);
                System.out.println("I am a thread not a threat.");
            } catch (InterruptedException f) {
                Thread.currentThread().interrupt();
                System.out.println("Im a thread, not a hazard.");
             break;
            }
        }
    }
}
class RunnableThreads2 extends Thread {
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
            Thread.sleep(100);
                System.out.println("I am a thread and I am running.");
            }
            catch (InterruptedException f) {
             Thread.currentThread().interrupt(); //to properly reset the interrupt status of the thread
                System.out.println("I am a thread and I am Interuppted.");
                break;
            }
        }
    }
}
public class ThreadMethods {
    public static void main(String[] args) throws InterruptedException {
    RunnableThreads FS = new RunnableThreads();
    RunnableThreads2 AS = new RunnableThreads2();
    FS.start();
    AS.start();
        Thread.sleep(5000);
        FS.interrupt();// Interrupt the thread
        AS.interrupt();
        FS.join(); // Wait for the thread to finish
        AS.join();
        System.out.println("Thread has been stopped");
      }
 }
 //example 3
class MyTask extends Thread {
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Thread.sleep(1000); // Doing some work
                System.out.println("Working...");
            } catch (InterruptedException e) {
                // Thread was interrupted while sleeping
                System.out.println("Interrupted! Stopping...");
                Thread.currentThread().interrupt(); // Re-set the interrupt flag
                break; // Exit the loop
            }
        }
    }
}
public class ThreadMethods {
    public static void main(String[] args) throws InterruptedException {
        MyTask task = new MyTask();
        task.start(); // Start the thread
        Thread.sleep(3000); // Let it run for a while
        task.interrupt(); // Request the thread to stop
        task.join(); // Wait for the thread to finish

        System.out.println("Thread has stopped.");
    }
}
        //Thread.sleep(1000) in MyTask: Makes the MyTask thread pause every second, simulating work or waiting.
        //Thread.sleep(3000) in main: Lets the MyTask thread run for 3 seconds before interrupting it.