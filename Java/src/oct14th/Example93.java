package oct14th;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Example93 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("x.txt"));
        System.setOut(new PrintStream("target.txt"));
        //读取键盘输入的字符
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String line;
        while((line=br.readLine())!=null){  //判断读取到的一行是否有数据
            System.out.println(line);   //打印读取到的一行数据
            //👆因为输出被重定向,所以不会再在终端中输出了
        }
    }
}