package threadpool;

public class RunnableThread implements Runnable{
    private int index;
    public RunnableThread(int index){
        this.index = index;
    }

    public void test() {
        RunnableThread runnableThread = new RunnableThread(index);
        Thread thread = new Thread(runnableThread);
        thread.start();
    }

    public void run() {
        System.out.println("线程池方法创建线程："+Thread.currentThread().getName());
    }
}
