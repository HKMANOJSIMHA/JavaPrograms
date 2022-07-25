


import java.util.concurrent.Semaphore;

public class Pc2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Semaphore sem = new Semaphore(1);
        for(int i=0;i<=9;i++) {
        	 new InThread(sem, "A");
             new DeThread(sem, "B");
        }
    }

}
// A shared resource.

class Shared1 {
    static int count = 0;
}

// A thread of execution that increments count.
class InThread implements Runnable {

    String name;
    Semaphore sem;

    InThread(Semaphore s, String n) {
        sem = s;
        name = n;
        new Thread(this).start();
    }

    public void run() {
        try {
        		sem.acquire();
                Shared1.count++;
                System.out.println(name + ": " + Shared1.count);
                sem.release();
            }catch (InterruptedException exc) {
            System.out.println(exc);
        }
    }
  


// A thread of execution that decrements count.
class DeThread implements Runnable {

    String name;
    Semaphore sem;

    DeThread(Semaphore s, String n) {
        sem = s;
        name = n;
        new Thread(this).start();
    }

    public void run() {
        try {
        	sem.acquire();
            System.out.println(name + ": " + Shared1.count);
            sem.release();
        } catch (InterruptedException exc) {
            System.out.println(exc);
        }
    }
}

