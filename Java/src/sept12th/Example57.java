//Calendar类
package sept12th;
import  java.util.Calendar;
public class Example57{
    public static void main(String[] args){
        Calendar a = Calendar.getInstance();
        int year=a.get(Calendar.YEAR);
        int month=a.get(Calendar.MONTH)+1;
        int date=a.get(Calendar.DATE);
        int hour=a.get(Calendar.HOUR_OF_DAY);
        int minute=a.get(Calendar.MINUTE);
        int second=a.get(Calendar.SECOND);
                       //👆括号内是Calendar类中的静态常量,它们会返回对应当前对象时间的值
        System.out.printf("现在的时间是:%d年%d月%d日 %d点%d分%d秒\n",year,month,date,hour,minute,second);

        Calendar b=Calendar.getInstance();
        b.set(2019,9,13);
        b.add(b.DATE,-100);
        int x=b.get(b.YEAR),y=b.get(b.MONTH)+1,z=b.get(b.DATE);
        System.out.printf("从2019年9月13日起100天后的日期为:\n%d年%d月%d日",x,y,z);

    }
}
/* Calendar类用于完成日期和时间字段的操作,它可以通过特定的方法设置和读取日期的特定部分.
不同于其他util包中的类的是,Calendar类是一个抽象类,不可初始化;
使用时首先需要调用其静态方法getInstance()来得到一个Calendar对象,然后才能调用其相应的方法.
格式:   Calendar a=Calendar.getInstance();
                            👆获取表示当前时间的Calendar对象
Calendar类的常用方法:
int get(int field)                                                          返回指定日历字段的值
void add(int field ,int amount)                                             根据日历规则,为指定的日历字段增加或减去指定的时间
void set(int field,int value)                                               为指定日历字段设置指定值
void set(int year,int month,int date)                                       设置Calendar对象的年月日
void set(int year,int month,int date,int hourOfDay,int minute, int second)   设置Calendar对象的年月日时分秒

Calendar还包括一系列的静态变量,其意义易于从变量名称上理解,恕不一一讲述.
*/