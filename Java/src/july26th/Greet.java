//static方法
package july26th;
class Greet{
    public static void sayHello(){
        System.out.println("hello!");
        System.out.println("こんにちは!");
        System.out.println("你好!");
    }
    //用static修饰的方法称为静态方法
    //静态方法不需要初始化即可被外部调用
    //静态方法中只能访问用static修饰的成员

    //(因为要先初始化对象才能访问没有static修饰的成员,
    //而静态方法再被调用时不会创建任何对象,
    //体现出了static方法的局限性和不常见的原因.)
    //不过,由于使用了static方法,代码量也会因此减少.
}