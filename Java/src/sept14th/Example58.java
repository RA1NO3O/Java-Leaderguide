//DateFormat类
package sept14th;
import java.text.DateFormat;
import java.util.Date;
public class Example58{
    public static void main(String[] args)throws Exception{
        Date a=new Date();              //👆此处处理了来自parse()方法的异常
        DateFormat b=DateFormat.getDateInstance(DateFormat.FULL);
        DateFormat c=DateFormat.getDateInstance(DateFormat.LONG);
        DateFormat d=DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
        DateFormat e=DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
        DateFormat f=DateFormat.getDateTimeInstance();
        System.out.println("当前日期的完整格式为:"+b.format(a));
        System.out.println("当前日期的长格式为:"+c.format(a));
        System.out.println("当前日期的普通格式为:"+d.format(a));
        System.out.println("当前日期的短格式为:"+e.format(a));
        System.out.println(f.format(a));

        DateFormat df1=DateFormat.getDateInstance(DateFormat.LONG);
        String d1="2019年9月14日";
        System.out.println(df1.parse(d1));
    }
}
/*  先前的Date类用于表示日期和时间,但如果要将Date对象表示的日期以指定的格式输出,就需要用到专门的DateFormat类.
    DateFormat类属于java系统的text系列包,使用前注意要先导入java.text.DateFormat;
    DateFormat类专门用于将日期格式化为字符串,或者用特定格式显示的日期字符串转换成一个Date对象.
    同Calendar类一样,DateFormat也是抽象类,需要通过getDateInstance()等一系列静态方法来创建对象
    格式:   DateFormat a=DateFormat.※();
                                    👆DateFormat类的静态方法
    以下是一些可以用于※处的常用静态方法:
    static DateFormat getDateInstance(int style)                             用于创建默认语言环境和参数所指定格式化风格的日期格式器(其中参数可省略)
    static DateFormat getDateTimeInstance(int dateStyle,int timeStyle)       用于创建默认语言环境和参数所指定格式化风格的日期/时间格式器(其中参数可省略)

    以下是DateFormat类的其他常用方法:
    String format(Date date)                将Date格式的日期参数转化为日期/时间字符串
    好吧实际上parse方法比format()更常用一点ovo
    Date parse(String source)               将参数所给定字符串解析成为一个Date格式的日期
         👆使用parse()方法时会抛出异常,需要处理.

    此外,DateFormat类也有一系列静态变量:
    FULL        表示完整格式日期
    LONG        表示长格式日期
    MEDIUN      表示通常格式日期
    SHORT       表示短格式日期
        
    其余的静态变量作用易于从变量名称上理解,这里恕不一一讲述啦.

*/