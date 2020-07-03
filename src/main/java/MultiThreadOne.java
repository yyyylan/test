import org.junit.Test;

/**多线程实现方式通过继承Thread类
 * */
public class MultiThreadOne extends Thread{
    public MultiThreadOne(){}
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
    @Test
    public void thread1(){
        MultiThreadOne t1 =new MultiThreadOne();
        MultiThreadOne t2 = new MultiThreadOne();
        t1.setName("线程1");
        t2.setName("线程2");
        //启动一个新的线程
        t1.start();
        t2.start();



    }

}
