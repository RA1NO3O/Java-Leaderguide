package july28th;
class Example16{
    public static void main(String[] args){
        Outer.Inner a = new Outer.Inner();  //静态内部类的实例化方式与非静态的成员内部类的实例化方式不同
        a.show();
    }
}
