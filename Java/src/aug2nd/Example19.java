package aug2nd;
class Example19{
    public static void main(String[] args){
        A a = new A();
        a.b();
    }
}
//final关键字可用于修饰类/变量/方法
//final修饰的类不能被继承
//final修饰的方法不能被子类重写
//final修饰的变量是常量,只能赋值一次;一旦被赋值,就无法改变.