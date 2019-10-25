//方法内部类
package july28th;
class Fic{
    private int num=4;
    public void test(){
        class Inner{
            void show(){
                System.out.println("num="+num);
            }
        } 
        Inner in = new Inner();
        in.show();    
    }
}
//在成员方法中定义的类称为方法内部类.
//方法内部类只能在当前方法中被使用
//方法内部类中可以访问外部类的成员变量
