//字符串的替换和去除空格操作
package aug31th;
public class Example42{
    public static void main(String[] args){
        String a="abcdabcd";
        System.out.println("将ab替换成xy的结果为:"+a.replace("ab", "xy"));
        String b=" a b c d     ";
        System.out.println("去除字符串首尾的空格结果为:"+b.trim());
        System.out.println("去除所有的空格结果为:"+b.replace(" ",""));
    }
}
/* String类的常用方法:
        方法声明                                               |           功能描述
String      replace(CharSequence oldstr,CharSequence newstr)     使用newstr替换给定字符串中出现过的所有oldstr
String      trim()                                               返回去除了给定字符串首尾的空格的字符串(不包括夹杂在字符中的空格)
👆返回值类型 👆方法名称

小提示:当replace方法中newstr部分给定的字符串为空(即"")时,就变成了删除所有在字符串里出现过的oldstr.
*/