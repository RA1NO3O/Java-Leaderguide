//String类的初始化
package aug30th;
public class Example39{
    public static void main(String[] args) throws Exception{
        String a=new String();
        //👆创建一个空的字符串
        String b=new String("abcd");
        //👆创建一个内容为"abcd"的字符串
        char[] c=new char[]{'d','e','f'};
        //👆创建一个内容为字符数组的字符串
        String d=new String(c);

        System.out.println("a"+a+"b");
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
/* String类的构造方法:
        方法声明                  |                功能描述
        String()                        创建一个内容为空的字符串
        String(char[] value)            根据指定的字符数组创建对象
        String(String value)            根据指定的字符串内容创建对象

    这些方法一般用于字符串初始化的等号右边部分.
*/