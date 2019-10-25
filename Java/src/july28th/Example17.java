package july28th;
public class Example17{
    public static void main(String[] args){
        Fic a = new Fic();
        a.test();
    }
}
//由于Inner是方法内部类,程序只能在方法中创建该类的实例对象并调用show方法
// * 方法内部类也可访问外部类的成员变量