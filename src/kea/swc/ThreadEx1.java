package kea.swc;
/*
Exercise 1:
Make a Java program that can create and start an arbitrary number of threads, each
given a name (use the documentation). The thread should print out its name when
started. Try different combinations of how objects are instantiated and started { what
influence does that have?
 */
public class ThreadEx1 {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            new Thread("" + i) {
                public void run() {
                    System.out.println();

                }
            };
        }

    }
}
