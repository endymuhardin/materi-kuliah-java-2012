package belajar.multithreading;

public class MultithreadDemo{
    public static void main(String[] xx) throws Exception {
        new MultiThread().start();
        new MultiThread().start();
    }
}

class MultiThread extends Thread {
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println("Counter : "+i);
            try {
                Thread.sleep(1000);
            } catch (Exception err) {
                err.printStackTrace();
            }
        }
    }
}
