package thread;

public class Example {
    public static void main(String[] args) {
        // Create a new thread
        Thread myThread = new Thread(new Runnable() {
            public void run() {
                System.out.println("Thread is running.");
            }
        });

        // Start the thread
        myThread.start();

        // Sleep for a short time
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Suspend the thread
        myThread.suspend();

        // Sleep for a short time
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Resume the thread
        myThread.resume();

        // Sleep for a short time
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Interrupt the thread
        myThread.interrupt();

        // Wait for the thread to finish
        try {
            myThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread has finished.");
    }
}

