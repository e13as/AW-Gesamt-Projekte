public class SimpleTesting implements Runnable{
    public static void main(String[] args){
        SimpleTesting st = new SimpleTesting();
        Thread one = new Thread(st);
        one.start();
    }
    public void run() {
        try {
            System.out.println("New Thread Start");
            Thread.sleep(2000);
            System.out.println("Thread sleep for 1 second.");
        } catch(InterruptedException e) {
            System.out.println(e);
        }
    }
}