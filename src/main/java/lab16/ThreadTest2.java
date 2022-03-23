package lab16;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author shkstart
 * @create 2021-12-13 {TIME}
 */
public class ThreadTest2 extends Thread{
    private int ticket = 200;
    private  final ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true){
            try {
                lock.lock();
                if (ticket > 0){
                    try {
                        Thread.sleep(10);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":卖票,并且卖了" + (ticket--) + "张票");
                }else {
                    break;
                }
            }finally {
                lock.unlock();
            }
        }

    }

    public static void main(String[] args) {
        ThreadTest2 threadTest2 = new ThreadTest2();

        Thread tA = new Thread(threadTest2);
        Thread tB = new Thread(threadTest2);
        Thread tC = new Thread(threadTest2);
        tA.setName("窗口一");
        tB.setName("窗口二");
        tC.setName("窗口三");
        tA.start();
        tB.start();
        tC.start();
    }
}
