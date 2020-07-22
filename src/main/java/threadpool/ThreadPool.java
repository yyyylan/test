package threadpool;

import org.junit.Test;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.util.concurrent.Executors.*;

/**通过资源池创建多线程
* */
public class ThreadPool{
    private static int NumPool = 10;
    @Test
    public void pool() throws InterruptedException{
        //newFixedThreadPool创建一个定长的线程池，控制最大并发量
        ExecutorService executorService = newFixedThreadPool(5);
        for (int i=0; i<NumPool;i++){
            RunnableThread thread = new RunnableThread(i);
            //Thread.sleep(1000);
            executorService.execute(thread);

        }
        //关闭线程池
        executorService.shutdown();
    }
}
