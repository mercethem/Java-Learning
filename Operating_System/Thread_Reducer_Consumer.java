package Operating_System;

public class Thread_Reducer_Consumer {

    public static void main(String[] args) {
        data d = new data();
        d.ival = 100;
        producer p = new producer(d);
        consumer c = new consumer(d);
        Thread t = new Thread(c);
        p.start();
        t.start();
    }
}

class producer extends Thread {
    data d;

    public producer(data d) {
        this.d = d;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (d) { //Thread synchronized ===> critic
                d.ival++;
                System.out.println("Producer " + d.ival);
            }
        }
    }
}

class consumer implements Runnable {
    data d;

    public consumer(data d) {
        this.d = d;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (d) {  //Thread synchronized ===> critic
                d.ival--;
                System.out.println("Consumer " + d.ival);
            }
        }
    }
}

class data {
    int ival;
}

