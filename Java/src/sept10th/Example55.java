//Integer类的常用方法
package sept10th;
public class Example55{
    public static void main(String args[])throws Exception{
        Integer num=new Integer(20);
        int a=10;
        int sum=num.intValue()+a;
        System.out.println(sum);
        String str="123";
        int i = Integer.parseInt(str,8);
        System.out.println(i);
    }
}
/*
toBinaryString(int i)               以二进制无符号整数形式返回一个整数参数的字符串
toHexString(int i)                  以十六进制无符号整数形式......
toOctalString(int i)                以八进制......
valueOf(int i)                      返回一个表示指定的int值的Integer实例
valueOf(String s)                   返回保存指定的String值的Integer对象
parseInt(String s,int radix)        将字符串参数以radix数字为进制,并作为有符号的整数进行转换
intValue()                          将Integer类型的值以int类型返回
*/