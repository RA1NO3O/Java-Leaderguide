//匿名内部类
package aug6th;
public class Example26{
    public static void main(String[] args){
        class C implements B{
            public void y(){
                System.out.println("2019/8/6 15:31:11");
            }
        }
        z(new C());
        /*写法2:

        z(new B(){
            public void y(){
                System.out.println("2019/8/6 15:40:45");
            }
        });
        在调用z方法时,在方法的参数位置写上了new B(){},
        相当于创建了一个对象,并将对象作为参数传送给z()方法.
        在new B后面的一对大括号表示创建的对象为B的子类实例,该子类是匿名的.
        */
    }
    public static void z(B i){
        i.y();
    }
}
//如果方法的参数被定义为一个接口类型,就需要定义一个类来实现接口,并根据该类进行对象实例化.
//或者,使用匿名内部类来实现接口.
//匿名内部类的格式:
/*
new 父类/接口(参数){
    *代码*
}
*/

//*实际上,匿名内部类是实现接口的一种简便写法.