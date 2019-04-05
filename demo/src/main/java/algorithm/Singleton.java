package algorithm;

/**
 * volatile 关键字
 * 线程间可见性
 * 有序性，防止指令重排
 */
public class Singleton {

    private static volatile Singleton instance;

    private Singleton(){
    }

    public static Singleton getInstance(){
        synchronized(Singleton.class){
            if (instance == null) {
                instance = new Singleton();
            }
        }
        return instance;
    }
}
