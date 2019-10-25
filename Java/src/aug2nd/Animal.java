//抽象方法
package aug2nd;
abstract class Animal{
    abstract void shout();
}
//在方法的实现方式无法确定的情况下,可以使用abstract关键字来修饰.
// ❗ 通过abstract创建的方法,不需要大括号.
// ❗ 当一个类中包含了抽象方法,该类也必须用abstract修饰.即抽象类
// ❗ 抽象类不可实例化,其中的抽象方法也不可被调用
/* 格式:
abstract class A{
    abstract 返回值类型 b();
}
*/
//实际上,抽象类也可以不包含任何抽象方法.
//如果想调用抽象类中定义的方法,则需要创建一个子类,在子类中将抽象类中的抽象方法进行实现.
/* 示例:

abstract class A{
    abstract void b();
}
class C extends A{
    void b{
    👆在此处重写了父类A的抽象方法.    
    }
}

*/
