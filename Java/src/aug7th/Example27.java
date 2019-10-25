//异常
package aug7th;
public class Example27{
    public static void main(String[] args){
            int result=divide(4,0);
            System.out.println(result);
    }
    public static int divide(int x,int y){
        int result=x/y;     //出现算术级错误*
        return result;
    }
}
//Throwable的继承体系:
/*
Throwable
  ├Error       //Java运行时产生的系统内部错误或资源耗尽的错误
  │  ├IOError    这种错误产生时,Java程序将会强制结束,无法挽救.
  │  ├AWTError
  │  └……
  └Exception    //程序中产生的可挽救级别的异常,可通过Debug等方式解决.
     ├RuntimeException
     │  ├ArithmeticException
     │  ├ClassCastException
     │  └……
     └……
*/
//Throwable类中常用的方法:
//     方 法 声 明                     |                 功 能 描 述
//String getMessage()                       以字符串格式返回此Throwable的详细消息
//void printStackTrace()                    将此Throwable及其追踪输出至标准错误流
//void printStackTrace(PrintStream s)       将此throwable及其追踪输出到指定的输出流