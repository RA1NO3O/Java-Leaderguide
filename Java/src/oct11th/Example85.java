package oct11th;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.LineNumberReader;

public class Example85{
    public static void main(String[] args)throws Exception{
        FileReader a=new FileReader("Example85.java");      //创建字符输入流
        FileWriter b=new FileWriter("copy.txt");       //创建字符输出流
        LineNumberReader c=new LineNumberReader(a);     //使用LineNumberReader包装FileReader对象
        c.setLineNumber(0);         //设置读取文件的起始行号
        String line=null;
        while((line=c.readLine())!=null){
            b.write(c.getLineNumber()+":"+line);        //将行号写入到文件中
            b.write("\r\n");           //写入换行符
        }
        c.close();  b.close();
    }
}