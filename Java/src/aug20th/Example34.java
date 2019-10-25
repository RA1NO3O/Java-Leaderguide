package aug20th;
public class Example34{
    public static void main(String[] args){
        Thread t1=new YieldThread("线程0");
        Thread t2=new YieldThread("线程1");
        t1.start();
        t2.start();
    }
}
//（〃｀ 3′〃）