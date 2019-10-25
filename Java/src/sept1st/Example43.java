//字符串的判断方法
package sept1st;
import java.util.Scanner;
public class Example43{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String s1=in.next();
        String s2="abc";
        if(s1.isEmpty()){
            System.out.println("字符串是空的.");
        }else{
            if(s1.startsWith("abc")){
                System.out.println("字符串以abc开头.");
            }else{
                System.out.println("字符串不以abc开头.");
            }

            if(s1.contains("d")){
                System.out.println("字符串中出现过d.");
            }else{
                System.out.println("字符串中没有出现过d.");
            }
            if(s1.equals(s2)){
                System.out.println("该字符串与s2字符串相同.");
            }
        }
        in.close();
    }
}
/* String类的常用方法:
        方法声明                                               |           功能描述
boolean     endsWith(String suffix)                              判断此字符串是否以给定的字符串结尾
boolean     startsWith(String prefix)                            与上一个方法的作用相反
boolean     isEmpty()                                            仅当字符串长度为0时返回true,反之亦然
boolean     contains(CharSequence s)                             判断此字符串中是否包含指定的字符序列
boolean     equals(Object anObject)                              判断调用此方法的字符串是否与给定字符串相等
👆返回值类型 👆方法名称

关于比较两个字符串为什么不能直接用==符号判断的解释:
    ==方法相对于字符串类型,只能用于判断两个字符串对象的地址是否相同;
    而equals()属于是String类特有的方法,专用于比较两个字符串中的字符是否相等.
    此外,不同的字符串变量在内存的地址是绝对不可能相同的;
    所以才会出现当使用==判断两个不同字符串时始终返回false的现象.
    (PS:摸索了好久qvq我连CE都用上了)

*/