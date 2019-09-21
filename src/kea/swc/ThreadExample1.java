package kea.swc;
public class ThreadExample1 extends Thread {

    public void run() {
        System.out.println("My name is: " + getName());
    }

    public static void main(String[] args) {
        ThreadExample1 t1 = new ThreadExample1();
        ThreadExample1 t2=new ThreadExample1();
        t1.start(); //creates and prints Thread -0
        t2.start(); //creates and prints Thread -1

        // main is the name of the main thread that starts the java program
        System.out.println("My name is: " + Thread.currentThread().getName());
    }

    //a constructor could be used to give names for the created threads
    //run the program several times to check that the order of the names printed changes

}
