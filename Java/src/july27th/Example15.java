package july27th;
public class Example15{
    public static void main(String[] args){
        Outer.Inner inner=new Outer().new Inner();
        inner.show();
    }
}
//*如果内部class被声明为private,外部将无法访问.
//比如,将Outer中的Inner用private修饰,则本程式会报错.