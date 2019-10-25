//多线程
package aug13th;
class MyThread extends Thread{
    public void run(){
        int num2=0;
        while(true){
            num2+=10;
            System.out.println(num2);
        }
    }
}
//Java提供了两种多线程的实现方式:
// · 继承java.lang包下的Thread类,覆写Thread类的run()方法,在run()方法中实现运行在线程上的代码.
        //在Thread类中,提供了一个start()方法用于启动新线程,线程启动后,系统会自动调用run()方法.
        //但是,由于Java仅支持单继承,导致继承了Thread的子类无法再继承其他父类.

/*          单线程                    多线程
        Example31.main()       Example31.main()
              👇                       ╠═════════════════╗
         MyThread.run()           while()语句       MyThread.run()
              👇完成后才会执行          ║
          while()语句             println()语句
              👇
         println()语句
*/