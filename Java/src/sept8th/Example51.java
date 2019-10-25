//Math类
package sept8th;
public class Example51{
    public static void main(String[] args){
        System.out.println("-1的绝对值为:"+Math.abs(-1));
        System.out.println("大于5.6的最小整数为:"+Math.ceil(5.6));
        System.out.println("小于-4.2的最大整数为:"+Math.floor(-4.2));
        System.out.println("对-4.6进行四舍五入的结果为:"+Math.round(-4.6));
        System.out.println("两个数的较大值为:"+Math.max(2.1,-2.1));
        System.out.println("随机生成一个大于0小于1的随机值的结果为:"+Math.random());
        System.out.println("3的4次方为:"+Math.pow(3,4));
        System.out.println("1/3的正弦值为:"+Math.sin(1/3));
        System.out.println("9的平方根为:"+Math.sqrt(9));
    }
}
//Math类是java系统的数学操作类,提供了一系列用于数学运算的静态方法.
//此外,Math类中还有两个静态常量PI和E,分别代表圆周率和自然对数.