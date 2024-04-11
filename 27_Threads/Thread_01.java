//  Thread is use to handaled maltipal task at a particular point of time.

class A14 extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B14 implements Runnable { // you can also create a Thread also by Runnebale Method.
    // you can use the Lambda Expretion( = () -> {}; ) here b/s Runnable intarface is @FunctionalInterface type Intaface
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Thread_01 {
    public static void main(String[] args) {
        A14 obj1 = new A14();
        B14 obj2 = new B14();

        // Priority(1 - 10)
        // System.out.println(obj1.getPriority());
        // obj1.setPriority(Thread.MAX_PRIORITY);
        // System.out.println(obj1.getPriority());

        obj1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // you cannot access the start method in runnable intarface.(you want to
        // implement following)
        Thread t1 = new Thread(obj2);
        t1.start();
        // both the Thred are work a aeme time
    }
}