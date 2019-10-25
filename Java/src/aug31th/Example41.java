//字符的转换操作
package aug31th;
public class Example41{
    public static void main(String[] args){
        String str="abcd";
        System.out.print("将字符串转为字符数组后的结果:");
        char[] str2=str.toCharArray();
        for(int i=0;i<str2.length;i++){
            if(i!=str2.length-1){
                System.out.print(str2[i]+",");
            }else{//数组中最后一个元素的输出
                System.out.println(str2[i]);
            }
        }
        System.out.println("将int值转换为String类型之后的结果:"+(String.valueOf(12)+"1"));
        System.out.println("将字符串转换成大写之后的结果"+str.toUpperCase());
    }
}
/* 
方法声明                                               |           功能描述
char[]      toCharArray()                                   将给定字符串转换为字符数组
String      valueOf(int i)                                  返回给定整数的字符串格式
String      toLowerCase()                                   使用默认语言环境的规则将给定的字符串中的所有字符都转换为小写
String      toUpperCase()                                   与上一个方法的作用相反
👆返回值类型 👆方法名称

*/