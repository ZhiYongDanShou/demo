package lab16;

import java.util.concurrent.CountDownLatch;

/**
 * @author shkstart
 * @create 2021-12-14 {TIME}
 */
public class CountDownLatchTest {
    public static void main(String[] args) {
        CountDownLatch count = new CountDownLatch(3);
        TranslateThead thead1 = new TranslateThead("1st content", count);
        TranslateThead thead2 = new TranslateThead("1st content", count);
        TranslateThead thead3 = new TranslateThead("1st content", count);
        thead1.start();
        thead2.start();
        thead3.start();

    }
}
class TranslateThead extends Thread{
    @Override
    public void run() {
        if (Math.random() > 0.5){
            throw new RuntimeException("原文存在非法字符");
        }
        System.out.println(content + "的翻译已经完成,译文是....");
        count.countDown();
    }

    private String content;
    private final CountDownLatch count;

    TranslateThead(String content, CountDownLatch count) {
        this.content = content;
        this.count = count;
    }
}