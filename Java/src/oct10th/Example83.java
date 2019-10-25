package oct10th;

import java.io.FileWriter;

public class Example83{
    public static void main(String[] args) throws Exception{
        FileWriter writer=new FileWriter("out.txt",true);
        String str="e(○｀ 3′○)";
        writer.write(str);
        writer.write("\r\n");//👈表示换行
        writer.close();
    }
}