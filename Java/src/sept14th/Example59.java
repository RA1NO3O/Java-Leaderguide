//SimpleDateFormat类
package sept14th;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Example59{
    public static void main(String[] args)throws Exception{
        SimpleDateFormat df1=new SimpleDateFormat("Gyyyy年MM月dd日:今天是yyyy年的第D天,E");
// 根据调试结果,完成以下的填空:                      |  |   |   |           |      |   👆
// 将答案写在手形符号右边.                           |  |   |   |           |      👆   
//                                                 |  |   |   👆          👆
//                                                 |  |   👆
//                                                 |  👆
//                                                 👆
        System.out.println(df1.format(new Date()));

        SimpleDateFormat df2=new SimpleDateFormat("yyyy/MMM/dd");
        String dt="2019/九月/14";
        System.out.println(df2.parse(dt));
    }
}
/*  在使用DateFormat对象将字符串解析为日期时,需要输入固定格式的字符串,这显然不够灵活.
    Java中还提供了一个SimpleDateFormat类,它是DateFormat类的子类.
    但是,SimpleDateFormat类却可以像通常类那样使用new()创建对象,
    导入时,只需导入java.text.SimpleDateFormat即可,无需担心其父类DateFormat.
    它的构造方法接收一个格式字符串参数,表示日期格式模板.

    神奇的是,SimpleDateFormat巧妙地将各类字母识别成了正确的日期格式,并以当前时间输出了出来.
    这是因为SimpleDateFormat有着能够解析字符串的的方法,其中包含了一系列字母占位符的日期模板,能够应对许多格式不一致的日期格式.
                                                👆format()
    拜其父类DateFormat所赐,SimpleDateFormat也🉑使用parse()方法,作用相同,但别忘了处理parse()方法抛出来的异常哦.
    
*/