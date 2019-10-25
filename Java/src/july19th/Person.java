//构造方法(5-7行部分),以下是写法一
package july19th;
class Person{
    int age;
    public Person(int a){//方法名与类名相同,没有声明返回值类型,没有ruturn语句.参数可选
        age=a;
    }
    public void speak(){
        System.out.printf("I am %d years old!",age);
    }
}
//采用以上写法将会替代掉系统提供的默认构造方法.
//如果主方法中初始化new Person时却没有在括号内给定对应的参数,则会报错

/* 写法2

class Person   *注意第17行没有 "{" 和 ";"
{
    *构造方法*
} 

 *这种由系统提供构造方法的写法亦可满足Example5中的new Person()的要求,不会报错,
  但遗憾的是,这种写法无法使用参数,局限性过高,往往无法满足大多数的Java程序开发的需求.
  仅推荐在程序设计竞赛(规则是用尽可能少的代码编程)的场合上采用方法2的写法.

*/