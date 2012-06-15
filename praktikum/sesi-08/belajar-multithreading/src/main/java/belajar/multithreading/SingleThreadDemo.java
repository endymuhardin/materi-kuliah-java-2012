package belajar.multithreading;

public class SingleThreadDemo{
    public static void main(String[] xx) {
        new SingleThread().start();
        new SingleThread().start();
    }
}

class SingleThread {
    public void start() {
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
