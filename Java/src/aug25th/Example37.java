package aug25th;
public class Example37{
    public static void main(String[] args){
        DeadLock t1=new DeadLock(true);
        DeadLock t2=new DeadLock(false);

        new Thread(t1,"A").start();
        new Thread(t2,"B").start();
    }
}
//关于运行结果的解释:
//A线程中有a同步锁,只有获得b同步锁才能执行完毕
//B线程中有b同步锁,只有获得a同步锁才能执行完毕
//两个线程都需要获得对方所占有的同步锁,但是都无法释放自己所拥有的同步锁
//导致最终这两个线程一直处于了挂起状态,造成了死锁.