//多态
package aug3rd;
public class Example22{
    public static void main(String[] args){
        C c1=new D();           //使用父类类型变量引用不同的子类对象
        C c2=new E();
        y(c1);
        y(c2);
    }
    public static void y(C a){
        a.x();
    }
}
//在同一方法中由于参数类型不同而导致执行效果不同的现象称为多态.
//Java允许使用一个父类类型的变量来应用一个子类类型的对象.
//示例:   父类名 变量名1=new 子类名1();
//       父类名 变量名2=new 子类名2();
//       👆将子类对象当作父类使用时无需额外声明,

//多态解决了方法同名的问题,提高程序的可扩展性和可维护性.