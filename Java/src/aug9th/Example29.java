//throws关键字
package aug9th;
import java.util.Scanner;
public class Example29{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        try{
            System.out.println("请依次输入被除数和除数.");
            int result = x(in.nextInt(),in.nextInt());
            System.out.println(result);
        }catch(Exception e){
            e.printStackTrace();
        }
        in.close();
    }
    public static int x(int a, int b)throws Exception{
        int result=a/b;
        return result;
    }
}
//在无法判断方法是否会有异常的情况,可在方法后使用throws关键字
//throws使用格式:
//修饰符 返回值类型 方法名(参数) throws 错误类型1{}

//使用throws关键字后,必须处理throws关键字声明的异常.
//处理者可以是catch()代码块,也可以是方法的调用者.