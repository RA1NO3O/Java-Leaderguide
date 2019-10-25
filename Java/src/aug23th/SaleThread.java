package aug23th;
class SaleThread implements Runnable{
    Object lock=new Object();
    private int tickets=10;
    public  void run(){
        synchronized(lock){
            while(tickets>0){
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"---卖出的票"+tickets--);
            }
        }
    }
}
/* 写法2:
class SaleThread implements Runnable{
    private int tickets=10;
    public synchonized void run(){
        while(tickets>0){
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"---卖出的票"+tickets--);
        }
    }
}
*/
//synchronized 关键字可用于修饰,代码块.
//synchronized 是java的一种同步机制.当新线程执行到含synchronized的代码块时,就会发生阻塞.
//等待上一个线程执行完毕后,新线程才能进入代码块开始执行.
//循环往复,直到所有的线程处理完毕为止.
//就好比满人的公共🚾,只有前一个人上完厕所后,后面的人才能用厕所.