package july31th;
class Neko extends Animal{  //🐱类继承动物类
    public void printName(){
        sound="喵~";
        name="旺财";
    }
}
//类的继承是再一个现有类的基础上去构建一个新的类,这样的类称作为"子类".
//子类自创建时就享有父类所有可继承的属性和方法.
//继承类的格式:
/*

class xxx extends xxx{
       👆子类名    👆父类名   
}

*/
//继承类仅支持单继承,不允许多继承,比如:
/*
class A{}
class B{}
class C extends A,B{}❌
*/

//多个子类可以继承一个父类,比如:
/*
class A{}
class B extends A{}✔
class C extends A{}✔
*/

//继承类允许多层继承,比如:
/*
class A{}
class B extends A{}
class C extends B{}  
 * 最终C类将会同时继承到A,B的属性和方法
*/
//Java中的子类和父类是相对的关系,一对父子类不会影响到其他的父子类工作.
//换言之,一个父类也可以是其他父类关系中的一个子类.