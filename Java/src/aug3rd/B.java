package aug3rd;
class B implements A{
    public void c(){
        System.out.println("执行了方法c");
    }
    public void d(){
        System.out.println("b+1="+(b+1));
    }
}
//整理:
/*
接口中的方法都是抽象的,不能直接实例化对象.

当一个抽象类实现接口时,实现接口中的部分方法亦可,否则需要实现接口中的所有方法

一个类通过implements实现多个接口时,接口之间要用都逗号隔开:
interface A{}
interface B{}
class C implements A,B{}

一个接口也可以通过extends继承一个/多个接口,多个接口之间用逗号隔开:
interface A{}
interface B{}
interface C extends A,B{}

一个类在继承另一个类的同时还可以实现接口.
格式:
class A extends B implements C{
        👆注意extends 和 implements的先后顺序
}
*/