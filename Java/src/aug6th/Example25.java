//Object类
package aug6th;
public class Example25{
    public static void main(String[] args){
        A a = new A();
        System.out.println(a.toString());
                            //👆调用了Object类的toString()方法
    }
}
//Object类是所有类的父类,每个类都隐性地直接/间接继承自Object类
//Object中的toString()方法的内容为:
/*
  return getclass().getName()+"@"+Integer.toHexString(hashCode());
         |                        |                   👆来自Object类的方法,将对象在内存的地址进行哈希计算,返回int类型的哈希值.
         |                        👆将括号中的int变量转化为16进制的字符串变量.
         👆返回对象的类名和包名(如果有).
*/

//在需要toString()方法返回特定信息的场合,可以重写toString()方法:
/*

public String toString(){
    return "ABCD";
}

*/