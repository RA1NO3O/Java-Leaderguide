//线程
package aug13th;
public class Example31{
    public static void main(String[] args){
        int num=0;
        MyThread a = new MyThread();
        a.start();
        while(true){
            num++;
            System.out.println(num);
        }
    }
}
//每个程序都由至少一个或多个执行单元同时运行,这样的执行单元称为线程.
//没有出现两段程序代码交替运行的程序称为单线程程序.反之为多线程程序.
//多线程程序在运行时,每个线程之间都是独立的,它们可以并发执行.