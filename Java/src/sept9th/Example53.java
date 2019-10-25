//Random类的方法
package sept9th;
import java.util.Random;
public class Example53{
    public static void main(String[] args){
        Random r=new Random();
        System.out.println("产生float类型的随机数:"+r.nextFloat());
        System.out.println("产生0-100之间的整形随机数:"+r.nextInt());
        System.out.println("产生double类型的随机数:"+r.nextDouble());
    }
}
/* Random类的常用方法:
boolean nextBoolean()       随机生成boolean类型的随机数
double nextDouble()         随机生成double类型的随机数(0-1之间)
float nextFloat()           随机生成float类型的随机数
int nextInt(int n)          随机生成0-n范围内的随机整数(参数可省略)
long nextLong()             随机生成long类型的随机数

*/