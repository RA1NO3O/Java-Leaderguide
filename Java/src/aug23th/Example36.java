//线程安全
package aug23th;
public class Example36{
    public static void main(String[] args){
        SaleThread a=new SaleThread();
        new Thread(a,"线程1").start();
        new Thread(a,"线程2").start();
        new Thread(a,"线程3").start();
        new Thread(a,"线程4").start();
    }
}
//多线程的并发执行虽然可以提高程序的效率,
//但是,当多个线程去访问同一个资源时,也会引发一些安全问题.
//为了解决这样的问题,需要限制资源在同一时刻的访问线程数.