//静态内部类
package july28th;
class Outer{
    private static int num=6;
    static class Inner{//使用static修饰,成为静态内部类
        void show(){
            System.out.println("num="+num);
        }
    }
}
//可以使用static关键字来修饰一个成员内部类,该内部类被称作静态内部类,它可以在不创建外部类对象的情况下被实例化.
//创建静态内部类的具体格式:
//外部类名.内部类名 变量名=new 外部类名.内部类名();

//  * 在静态内部类中只能访问外部类的静态成员(变量)
//比如说,如果num不是静态变量,程序就会出现错误.
//  * 在静态内部类中可以定义静态的成员,而在非静态的内部类中不允许定义静态的成员(变量).
/* 示例

class Outer{
    class Inner{
        static int num=4;❌
        👆不能在非静态内部类中定义静态变量
        void show(){
            System.out.println("num="+num);
        }
    }
}

*/