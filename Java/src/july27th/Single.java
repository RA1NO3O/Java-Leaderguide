//单例模式
package july27th;
class Single{
    private static Single INSTANCE = new Single();  //初始化对象部分靠自身完成
    private Single(){}  //私🈶化构造方法
    public static Single getInstance(){ //提供返回该对象的静态方法
        return INSTANCE;
    }
}
//在设计一个类时,🈶时需要保证在整个程序运行期间针对该类只存在一个实例对象.
//类的构造方法使用private修饰,声明为私🈶,不能在类的外部使用new关键字来创建实例对象
//在类的内部创建一个该类的实例对象,并用静态变量INSTANCE引用该对象,由于变量应该禁止外部访问,因此使用private修饰,声明为私🈶成员.(第4行)
//为了让类的外部能够获得类的实例对象,需要定义一个静态方法getInstance()用于返回该类的实例INSTANCE.
//由于方法是静态的,外部文件🉑以通过"类名.方法名"的方式访问.
/* 单例模式亦🉑写成以下格式:

    class Single{
        private Single(){}
        👆首先将类的构造方法私🈶,不需要/防止外界创建该类的实例

        public static final Single INSTANCE=new Single();
        |      |      👆禁止外部对该变量进行修改               
        |      👆让外部可以使用类名.变量名的形式来访问变量
        👆允许外部直接访问该变量
    }

*/
//被final修饰的变量称为常量,其值不🉑改变.
//*详细的final用法预计8月份会讲解到.