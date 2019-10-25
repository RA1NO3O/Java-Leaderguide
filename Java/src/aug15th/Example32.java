//线程优先级
package aug15th;
public class Example32{
    public static void main(String[] args){
        Thread a=new Thread(new MinPriority(),"低优先级线程");
        Thread b=new Thread(new MaxPriority(),"高优先级线程");
        a.setPriority(Thread.MIN_PRIORITY);
        b.setPriority(10);
        a.start();
        b.start();
    }
}
/* 优先级高的线程获得CPU执行的机率越大,优先级低的线程获得CPU执行的机会就会越小.
    线程的优先级用1-10之间的整数表示,其中10优先级最大,以此类推.
    此外,还可以使用Thread类中提供的三个静态常量表示线程的优先级:

        Thread类的静态常量                              功能概述
        static int MAX_PRIORITY             表示线程的最高优先级,相当于10
        static int MIN_PRIORITY             表示线程的最低优先级,相当于1
        static int NORM_PRIORITY            表示线程的普通优先级,相当于5

    程序再运行期间,处于就绪状态的每个线程都有自己的优先级.
    然而,线程的优先级从并不是不变的,可以通过Thread类的setPriority(int newPriority)方法对其进行设置.
                                                                  👆填入1-10之间的数字或者Thread类的三个静态常量.
    以下是残酷的現実：
        虽然Java中提供了10个线程优先级,但是这些优先级需要操作系统的支持,
        不同的操作系统对优先级的支持是不一样的,不能很好的和Java中线程优先级一一对应.
        だがら、在设计多线程应用程序时,不要过分依赖于线程的优先级,
        请把线程优先级作为一种提高程序效率的手段.
*/