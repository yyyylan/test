import org.junit.Test;

/**通过实现Runnable接口实现多线程
* */
public class MultiThreadTwo implements Runnable{
    @Test
    public void test(){
        System.out.println(Thread.currentThread().getName());
         MultiThreadTwo t1 = new MultiThreadTwo();
         Thread thread1 = new Thread(t1);
         MultiThreadTwo t2 = new MultiThreadTwo();
         Thread thread2 = new Thread(t2);
         thread1.start();
         thread2.start();
    }
    public void run() {
        System.out.println(Thread.currentThread().getName()+"通过实现接口的方式实现线程");
    }
}
