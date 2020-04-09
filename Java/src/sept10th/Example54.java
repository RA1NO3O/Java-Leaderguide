//包装类
package sept10th;
public class Example54{    
    public static void main(final String[] args){
       final int a=20;
       final Integer a1=new Integer(a) ;
            //👆创建了Integer对象a1,并将变量a作为参数传入
            //  从而将int变量转化为Integer类
       System.out.println(a1.toString());
                            //👆通过调用Integer类的toString方法,将Integer的值以字符串的形式打印出来
                            //  Object类是所有类的父类,此处Integer重写了父类Object的toString()方法
    }
}
//许多类的方法都需要接收引用类型的对象,这样会导致无法将一个基本数据类型的值传入.
//比如:在方法的参数中填入a.toString()是不正确的.
//解决这样的问题需要使用JDK中的包装类,将基本数据类型的值包装为引用数据类型的对象.

//在Java中,每种基本类型都有对应的包装类:
//基本数据类型          对应的包装类
//byte                  Byte
//char                  Character
//int                   Integer
//short                 Short
//long                  Long
//float                 Float
//double                Double
//boolean               Boolean

//可见,除了Integer和Catacter类,其他包装类的名称只是改动了首字母大写.
//所有的包装类都重写了其父类Object中的toString()方法.
//除了Character类以外,包装类都有valeOf()方法和parse※()方法,但要注意参数不能为null,还要确保不出现无法解析的字符串(比如"12c").
//否则即使编译通过,程序也会在运行期间出错.(代码编译器不会侦测这类字符串)

//※处对应包装类的数据类型名称.