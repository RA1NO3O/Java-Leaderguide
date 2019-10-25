//StringBuffer类
package sept3rd;
public class Example45{
    public static void main(String[] args){
        System.out.println("添加------------------------------------");
        add();
        System.out.println("删除------------------------------------");
        remove();
        System.out.println("修改------------------------------------");
        alter();
    }
    public static void add(){
        StringBuffer a=new StringBuffer();
        a.append("abcdefg");
        System.out.printf("append添加结果:\n%s\n",a);
        a.insert(2,"123");
        System.out.printf("insert添加结果:\n%s\n",a);
    }
    public static void remove(){
        StringBuffer a=new StringBuffer("abcdefg");
        a.delete(1,5);
        System.out.printf("delete指定位置结果:\n%s\n",a);
        a.deleteCharAt(2);
        System.out.printf("deleteCharAt指定位置结果:\n%s\n",a);
        a.delete(0,a.length());
        System.out.printf("清空缓冲区结果:\n%s\n",a);
    }
    public static void alter(){
        StringBuffer a=new StringBuffer("abcdef");
        a.setCharAt(1,'p');
        System.out.printf("修改指定位置字符结果:\n%s\n",a);
        a.replace(1, 3, "qqqq");
        System.out.printf("替换指定位置字符串结果:\n%s\n",a);
        System.out.printf("字符串翻转结果:\n%s",a.reverse());
    }
}
/*
在Java中,String(字符串)属于常量,不易修改.
相比之下,StringBuffer类中的方法却允许对字符串进行修改;

定义格式:
StringBuffer x = new StringBuffer("xxxx");
             👆变量名               👆内容

以下是StringBuffer类的常用方法:
    方法声明                                    |           功能描述
StringBuffer append(char c)                         添加一个字符到StringBuffer对象中
StringBuffer insert(int offset,String str)          将字符串中的offset位置插入字符串str
StringBuffer deleteCharAt(int index)                移除此字符串指定位置的字符
StringBUffer delete(int start,int end)              删除StringBuffer对象中指定范围的字符或字符串
StringBuffer replace(int start,int end,String s)    在StringBuffer对象中替换指定的字符或字符串
void         setCharAt(int index,char ch)           修改指定位置index处的字符
String       toString()                             返回StringBuffer缓冲区中的字符串
StringBuffer reverse()                              将此字符串反向重新排序(例如:abc变为cba)

关于append()和insert()方法的补充说明:
    这两个方法有着很多用以应对不同情况的重写形式,但最终目的都是用于添加字符.
    不同的是,append()方法始终将这些字符添加到缓冲区的末尾,而insert却可以在指定位置添加字符.

此外,StringBuffer类和String类有很多相似之处,在使用时容易混淆作用:
    首先,String类表示的字符串是常量,创建String变量后内容是无法改变的.
    而StringBuffer表示字符容器,其内容和长度可以随时修改.
    在操作字符串时,如果该字符串仅用作于比较,使用String类就可以了.
    如果有要对字符串中的字符进行修改等操作的必要,就应该使用StringBuffer类型创建变量来应对.
    
    以下是使用StringBuffer类的坏处:
        StringBuffer类不能像String类那样使用equals()方法,因为StringBuffer类中没有重写Object类的equals().
        换言之,就是java系统不知道如何用euqals()方法来比较StringBuffer类的变量.
            若是在程序中使用euqals()来比较StringBuffer变量,就只会返回false.
                示例:
                    StringBuffer a=new StringBuffer("abc");
                    StringBuffer b=new StringBuffer("abc");
                    System.out.println(a.equals(b));👈结果会输出false.
        
        String类对象之间可以用+号连接,而StringBuffer类对象之间不能.
            若是在程序中使用+号连接StringBuffer对象,则程序将无法通过编译).
*/