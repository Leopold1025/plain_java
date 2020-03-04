package multi_thread.join_method;

public class TestJoin extends Thread {
    private String name;

    public TestJoin(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        TestJoin join1 = new TestJoin("thread-1");
        TestJoin join2 = new TestJoin("thread-2");

        try {
            join1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        join1.start();
        join2.start();

        System.out.println("main--------------------线程");
    }

    @Override
    public void run() {
        for (int i=0; i<3; i++){
            System.out.println(Thread.currentThread().getName() + " => i = " + i);
        }
    }
}
