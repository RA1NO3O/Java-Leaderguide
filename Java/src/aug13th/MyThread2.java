package aug13th;
class MyThread2 implements Runnable{
    public void run(){
        int num2=0;
        while(true){
            num2+=10;
            System.out.println(num2);
        }
    }
}
// · 实现java.lang.Runnable接口,同样是在run()方法中实现运行在线程上的代码.
        //为了解决Java的单继承缺陷,Java的创始人想到了在Thread类提供另外一个构造方法Thread(Runnable target)的解决方案,
        //其中,Runnable是一个接口,它只有一个run()方法.
        //当通过Thread(Runnable target)构造方法创建对象时,只需为该方法传递一个实现了Runnable接口的实例对象,
        //这样一来,创建的线程将调用实现了Runnable接口中的run()方法作为运行代码,而非Thread类中的run()方法.
