package aug15th;
class MinPriority implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.printf("%s输出:%d.",Thread.currentThread().getName(),i);
        }
    }
}