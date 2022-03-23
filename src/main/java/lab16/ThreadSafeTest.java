package lab16;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author shkstart
 * @create 2021-12-13 {TIME}
 */
public class ThreadSafeTest implements Runnable {
    int num = 10;

    private  final ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true){
            try {
                lock.lock();

            if (num > 0){
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("tickets" + num--);
            }else {
                break;
            }
        }finally {
                lock.unlock();
            }
        }

    }

    public static void main(String[] args) {
        ThreadSafeTest t = new ThreadSafeTest();
        Thread tA = new Thread(t);
        Thread tB = new Thread(t);
        Thread tC = new Thread(t);
        Thread tD = new Thread(t);
        tA.start();
        tB.start();
        tC.start();
        tD.start();
    }
}
