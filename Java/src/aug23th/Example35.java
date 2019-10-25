//线程插队
package aug23th;
public class Example35{
    public static void main(String[] args) throws Exception{
        Thread t=new Thread(new EmergencyThread(),"紧急线程");
        t.start();
        for(int i=1;i<6;i++){
            System.out.println(Thread.currentThread().getName()+"输入:"+i);
            if(i==2){
                t.join();
            }
            Thread.sleep(500);
        }
    }
}
/*
当在某个线程中调用其他线程的join()方法时,调用的线程将被阻塞,
直到被join()方法加入的线程执行完成后才会继续运行.

*/