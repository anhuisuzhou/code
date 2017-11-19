import sun.nio.ch.ThreadPool;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by trh on 2017/11/14.
 */
public class Test {

    public static void main(String[] args) {
       
       print();
    }

    private static synchronized void print() {
        System.out.println("ok");
    }
}
