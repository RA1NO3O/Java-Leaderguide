package aug15th;
class MaxPriority implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"输出:"+i);
        }
    }
}