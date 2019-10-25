package oct11th;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Example86 {
    public static void main(String[] args) throws IOException {
        FileInputStream in=new FileInputStream("a.txt");    //创建字节输入流
        InputStreamReader isr=new InputStreamReader(in);    //将字节流输入转换成字符输入流
        BufferedReader br=new BufferedReader(isr);          //对字符输入流进行包装

        FileOutputStream out=new FileOutputStream("b.txt"); 
        OutputStreamWriter osw=new OutputStreamWriter(out); //将字节输出流转换成字符输出流
        BufferedWriter bw=new BufferedWriter(osw);          //对字符输出流进行包装
        String line;
        while((line=br.readLine())!=null){
            bw.write(line);
        }
        br.close();bw.close();
    }
}