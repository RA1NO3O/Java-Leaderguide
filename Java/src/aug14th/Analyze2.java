package aug14th;
public class Analyze2{
    public static void main(String[] args){
        TicketWindow2 tw=new TicketWindow2();
        new Thread(tw,"窗口1").start();
        new Thread(tw,"窗口2").start();
        new Thread(tw,"窗口3").start();
        new Thread(tw,"窗口4").start();

    }
}