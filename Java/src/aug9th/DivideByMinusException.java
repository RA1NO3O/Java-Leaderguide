//自定义异常类
package aug9th;
public class DivideByMinusException extends Exception{
//           👆创建了自定义异常类     👆继承了异常类
    
    private static final long serialVersionUID = -2162796594422514948L;

    public DivideByMinusException() {// 无参数构造方法
        super();    //使用super()来调用至Exception父方法的构造方法
    }
    public DivideByMinusException(String message){//有参数构造方法
        super(message);
    }
}
//在需要描述程序中特有的异常情况时,可以创建自定义异常类
//自定义异常类必须继承Exception或其派生类为父类
//若无特殊需求,参考以上代码创建自定义异常类即可.

//使用自定义异常类前,应在对应方法后追加"throws 自定义异常类名"并处理.

//使用自定义异常类格式:
//throw new 自定义异常类的构造方法();
