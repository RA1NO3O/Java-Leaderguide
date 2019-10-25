package july30th;
public class Test{
    public Test(){//构造方法#1
        System.out.println("已调用构造方法#1");
    }
    public Test(int x){//构造方法#2
        this();
        System.out.println("已调用构造方法#2");
    }
    public Test(boolean b){//构造方法#3
        this(1);
        System.out.println("已调用构造方法#3");
    }
    public Test(double c){//构造方法#4
        this(true);
        System.out.println("已调用构造方法#4");
    }

}
//提问:哪些构造方法在这个程序中调用过?