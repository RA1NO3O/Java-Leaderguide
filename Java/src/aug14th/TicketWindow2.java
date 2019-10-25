package aug14th;
class TicketWindow2 implements Runnable{
    private int tickets=100;
    public void run(){
        while(true){
            if(tickets>0){
                Thread th=Thread.currentThread();   //currentThread是Thread中的一个方法,它会返回当前的线程对象.
                String th_name=th.getName();        //getName()在此处用于获取线程的名称.
                System.out.printf("%s发售了第%d张票\n",th_name,tickets--);
            }
        }
    }
}