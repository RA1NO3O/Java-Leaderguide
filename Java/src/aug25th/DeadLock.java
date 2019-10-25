//死锁事件
package aug25th;
class DeadLock implements Runnable{
    static Object a=new Object();
    static Object b=new Object();
    private boolean flag;
    DeadLock(boolean flag){
        this.flag=flag;
    }
    public void run(){
        if(flag){
            while(true){
                synchronized (a){
                    System.out.println(Thread.currentThread().getName()+"---if---a");
                    synchronized(b){
                        System.out.println(Thread.currentThread().getName()+"---if---b");
                    }
                }
            }
        }else{
            while(true){
                synchronized(b){
                    System.out.println(Thread.currentThread().getName()+"---else---b");
                    synchronized(a){
                        System.out.println(Thread.currentThread().getName()+"---else---a");
                    }
                }
            }
        }
    }
}