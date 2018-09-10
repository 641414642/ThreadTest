import java.util.Timer;
import java.util.TimerTask;

public class TraditionalTimerTest {


    /**
     * 定时器
     *
     * @param args
     */
    public static void main(String[] args) {
        /**
         * 10秒之后执行一下后每3秒都执行
         */
//        new Timer().schedule(new TimerTask() {
//            @Override
//            public void run() {
//
//                System.out.println("bombing!");
//            }
//        }, 10000,3000);
//        while (true) {
//            System.out.println(new Date().getMinutes());
//            try {
//                Thread.sleep(1000);
//            }catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//        }

        class MyYImerTask extends TimerTask {
            @Override
            public void run() {
                System.out.println("bombing!");
                new Timer().schedule(new MyYImerTask(), 3000);
            }
        }
    }
}
