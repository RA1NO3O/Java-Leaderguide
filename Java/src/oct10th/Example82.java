package oct10th;
import java.io.FileReader;
public class Example82{
    public static void main(String[] args)throws Exception{
        FileReader a=new FileReader("a.txt");
        int ch;         //👈此变量用于记录读取的字符
        while((ch=a.read())!=-1){   //👈判断是否读取到文件的末尾(即-1)
            System.out.print(ch); //👈将获取到的字符转换为char类型并输出(不换行)
        }
        a.close();
    }
}