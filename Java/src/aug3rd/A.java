//接口
package aug3rd;
interface A{
    int b=1;
    void c();
    void d();
}
//如果一个抽象类中的所有方法都是抽象的,则可以将这个类用接口的方式来定义.
//定义接口时,只需将class替换为interface即可
//使用interface后,其中包含的方法不再需要abstract修饰.
//接口中定义的方法默认相当于使用了"public abstract"进行了修饰.
//接口中定义的变量默认相当于使用了"public static final"来修饰(全局常量).
//调用接口中的方法时,需要在其它类中使用implements关键字来实现接口中所有的方法.
//                                    👆使用位置及方法与先前的extends相同.