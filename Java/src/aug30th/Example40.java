//字符串的基本操作
package aug30th;
public class Example40{
    public static void main(String[] args) throws Exception{
        String a=new String("abcd");
        System.out.println("字符串的长度为:"+a.length());
        System.out.println("字符串第一个字符为:"+a.charAt(0));
        System.out.println("字符c最后一次出现的位置为:"+a.lastIndexOf('c'));
        System.out.println("字符c第一次出现的位置为:"+a.indexOf('c'));
    }
}
/* 
方法声明                                               |           功能描述
int         indexOf(int ch)                                      返回给定字符在此字符串中第一次出现的位置
int         lastIndexOf(int ch)                                  与上一个方法的作用相反
char        charAt(int index)                                    返回字符串中给定位置上的字符
int         length()                                             返回字符串长度

👆返回值类型 👆方法名称

*/
