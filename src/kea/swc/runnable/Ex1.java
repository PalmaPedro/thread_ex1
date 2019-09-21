package kea.swc.runnable;

 class Ex1 implements Runnable {
    public void run(){
        System.out.println("This thread is running...");
    }
}

 class ThreadEx1 {
    public static void main(String[] args) {
        Thread t = new Thread(new Ex1());
        t.start();
    }
}
