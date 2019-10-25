package sept29th;
import java.io.FileOutputStream;
public class Example78{
    public static void main(String[] args)throws Exception {
        FileOutputStream out=new FileOutputStream("out.txt",true);
        String str=" 小李冲呀owo";
        byte[] b=str.getBytes();
        for(int i=0;i<b.length;i++){
            out.write(b[i]);
        }
        System.out.println("输出完毕.");
        out.close();
    }
}