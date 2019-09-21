package kea.swc;

/*
Exercise 1:
Make a Java program that can create and start an arbitrary number of threads, each
given a name (use the documentation). The thread should print out its name when
started. Try different combinations of how objects are instantiated and started { what
influence does that have?
 */
class ThreadEx1 {
    public static void main(String[] args) {

        Ex1 e1 = new Ex1("thread1");
        Ex1 e2 = new Ex1("thread2");
        Ex1 e3 = new Ex1("thread3");
        Ex1 e4 = new Ex1("thread4");

        Thread t1 = new Thread(e1);
        Thread t2 = new Thread(e2);
        Thread t3 = new Thread(e3);
        Thread t4 = new Thread(e4);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}

// 1) extends Thread
class Ex1 extends Thread {
    String name;

    public Ex1(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            System.out.print(name);
        }
    }
}
// 2) implements runnable interface





