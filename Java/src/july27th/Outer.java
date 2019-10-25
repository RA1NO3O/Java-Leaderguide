//内部 class
package july27th;
class Outer{    //这是一个外部class(相对于Inner)
    private int num=4;
    public void test(){   //在test方法中访问内部class
        Inner inner = new Inner();  //在test方法中初始化了Inner对象
        inner.show();
    }
    class Inner{    //成员内部class
        void show(){
            //在成员内部class的方法中访问外部class的变量(4)
            System.out.println("num="+num);
        }
    }
    //内部class可以在外部class中被使用,并能访问外部class的成员
    //如果想通过外部class去访问内部class,则需要通过外部class对象去创建内部class对象,
    //以下是创建内部class对象的具体语法格式:
    /*
        
        外部class名.内部class名 变量名=new 外部class名().new 内部class名();

    */
    // 示例程序请参考Example15.java
}
