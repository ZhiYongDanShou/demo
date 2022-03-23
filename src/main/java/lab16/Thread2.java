package lab16;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author shkstart
 * @create 2021-12-14 {TIME}
 */
public class Thread2{
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        new Thread(()->{
            for (int i = 0; i < 50; i++) {
                ticket.run();
            }
        },"窗口一").start();

        new Thread(()->{
            for (int i = 0; i < 50; i++) {
                ticket.run();
        }
    },"窗口二").start();
        new Thread(()->{
            for (int i = 0; i < 100; i++) {
                ticket.run();
            }
        },"窗口三").start();
}

static class Ticket extends Thread{
    private int tickets = 200;
    Lock lock = new ReentrantLock();
    @Override
    public void run() {
        lock.lock();
        try {
            if (tickets > 0){
                Thread.sleep(10);
                System.out.println(Thread.currentThread().getName() + "卖的第" + tickets-- + "张票");
            }if (tickets < 1){
                System.out.println("票卖完了");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }    }
    }
}