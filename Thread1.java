class CountUpRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("CountUpThread: " + i);
            
        }
    }
}

class CountDownRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 10; i >= 1; i--) {
            System.out.println("CountDownThread: " + i);
            if (i == 6) {
                try {
                    System.out.println("CountDownThread sleeping for 1000ms...");
                    Thread.sleep(1000); // sleep when i is 6
                } catch (InterruptedException e) {
                    System.out.println("CountDownThread interrupted during sleep");
                }
            }
            
        }
    }
}

public class Thread1 {
    public static void main(String[] args) {
        Thread countUp = new Thread(new CountUpRunnable());
        Thread countDown = new Thread(new CountDownRunnable());

        countUp.start();
        countDown.start();
    }
}
