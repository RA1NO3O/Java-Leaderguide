package oct16th;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;

public class Example92 {
    public static void main(String[] args) throws IOException {
        final PipedInputStream pis=new PipedInputStream();
        final PipedOutputStream pos=new PipedOutputStream();
        pis.connect(pos);
        
        new Thread(new Runnable(){
        
            @Override
            public void run() {
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                PrintStream ps=new PrintStream(pos);
                while(true){
                    try{
                        System.out.print(Thread.currentThread().getName()+"需要输入内容");
                        ps.println(br.readLine());
                        Thread.sleep(1000);
                    }catch(Exception e){ e.printStackTrace(); }
                }
            }
        },"发送数据的线程").start();

        new Thread(new Runnable(){
        
            @Override
            public void run() {
                BufferedReader br=new BufferedReader(new InputStreamReader(pis));
                while(true){
                    try{
                        System.out.println(Thread.currentThread().getName()+"实际接收到的内容为:"+br.readLine());
                    }catch(IOException e){ e.printStackTrace(); }
                }
            }
        },"接收数据的线程").start();
    }
}