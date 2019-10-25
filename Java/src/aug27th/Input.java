//线程通信问题
package aug27th;
class Input implements Runnable{
    private Storage st;
    private int num;
    Input(Storage st){
        this.st=st;
    }
    public void run(){
        while(true){
            st.put(num++);
        }
    }
}
//在需要控制多个线程按照一定的顺序轮流执行时,需要让线程之间进行通信.
//以下方法隶属于Object类,可用于解决线程间的通信问题:

//   方法名称与其声明类型   |      方法描述
//       void wait()      | 使当前线程放弃同步锁并进入等待,直到其他线程进入此同步锁,并调用notify方法(或notifyAll()方法唤醒该线程为止)
//      void notify()     | 唤醒此同步锁之上等待的第一个调用wait()方法的线程
//     void notifyAll()   | 唤醒此同步锁之上的调用的所有线程

//🔵以上三种方法在使用时都离不开synchronized同步锁,因为这三个方法的调用者都应该是同步锁对象,
//  否则,Java系统会抛出IllegalMonitorStateException异常.

//🔵此外,还须处理这些方法抛出的异常.