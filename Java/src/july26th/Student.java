//static变量
package july26th;
class Student{
    static String schoolName;
    //用static修饰的变量称为静态变量
    //静态变量被所有对象共享
    //static只能用于成员变量(第4行),不能用于局部变量(例如方法中声明的变量)
    //以下是反面教材
    /*
    class Student(){
        public void study(){
            static int num=10;❌
        }
    }
    */
}