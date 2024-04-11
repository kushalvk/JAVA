
class Counter {
    int count;
    public synchronized void increment() { // 'synchronized' is use to execute a one Thread at a time the other Thread is waiting.
        count++;
    }
}

public class Race_Canditio_02 {
    public static void main(String[] args) throws InterruptedException {
        Counter cn = new Counter();

        // Lembda Expretion " = () -> {}; "
        Runnable obj = () -> {
            for (int i = 1; i < 1000; i++) {
                cn.increment();
            }
        };

        Runnable obj1 = () -> {
            for (int i = 1; i < 1000; i++) {
                cn.increment();
            }
        };

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);

        t1.start();
        t2.start();

        t1.join(); // Throws an exeption to main 'InterruptedException'
        t2.join();

        System.out.println(cn.count);
    }
}
