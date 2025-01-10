package Multithreading;
class SharedBuffer {
    private int buffer;
    private boolean isAvailable = false;

    
    public synchronized void produce(int value) throws InterruptedException {
        while (isAvailable) {
           
            wait();
        }
        buffer = value; 
        System.out.println("Produced: " + buffer);
        isAvailable = true; 
        notify();    }

    public synchronized void consume() throws InterruptedException {
        while (!isAvailable) {
                      wait();
        }
        System.out.println("Consumed: " + buffer);
        isAvailable = false; 
        notify();
    }
}

class Producer implements Runnable {
    private SharedBuffer buffer;

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                buffer.produce(i); 
                Thread.sleep(1000); }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer implements Runnable {
    private SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                buffer.consume(); 
                Thread.sleep(1500); }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class InterThreadCommunicationExample {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();

        Thread producerThread = new Thread(new Producer(buffer));
        Thread consumerThread = new Thread(new Consumer(buffer));

        producerThread.start();
        consumerThread.start();
    }
}

