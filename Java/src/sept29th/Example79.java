package sept29th;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
public class Example79{
    public static void main(String[] args)throws Exception {
        InputStream a = new FileInputStream("a.png");
        OutputStream b = new FileOutputStream("b.png");
        int c;  //写入媒介
        long startime=System.currentTimeMillis();  //获取系统时间
        while((c=a.read())!=-1){
            b.write(c);     //读取a至媒介c,再输出至b
        }
        long endtime=System.currentTimeMillis();
        System.out.printf("拷贝文件用时: %d 毫秒(单位1字节)\n",endtime-startime);

        byte[] d = new byte[1024];  //该媒介为字节类型的数组(单位KB),每次读取字节时都会填满数组的每一个下标
        //相比起int类型变量的媒介,byte类型的数组的处理效率会更高.

        int e;      //用于存储读入媒介d的字节个数
        startime=System.currentTimeMillis(); //替换掉先前的开始时间
        while((e=a.read(d))!=-1){
            b.write(d,0,e);     //从数组d的下标0(也就是第一个字节)开始向文件写入e个字节.
        }
        endtime=System.currentTimeMillis();
        System.out.printf("拷贝文件用时: %d 毫秒(单位1KB)",endtime-startime);
        a.close();
        b.close();

    }
}