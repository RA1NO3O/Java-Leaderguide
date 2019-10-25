//线程让步
package aug20th;
class YieldThread extends Thread{
    public YieldThread(String name){
        super(name);
    }
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread()+"---"+i);
            if(i==3){
                System.out.println(Thread.currentThread().getName()+"让步.");
                Thread.yield();
            }
        }
    }
}
/* 
线程让步可以通过yield()实现,该方法和sleep()类似,可以让当前正在运行的线程暂停,
不同的是,yield()方法不会阻塞线程,只是将线程转换成就绪状态,让系统再调度一次.
当某个线程调用了yield()方法之后,与当前线程优先级相同或者更高的线程将获得运行的机会.
*/