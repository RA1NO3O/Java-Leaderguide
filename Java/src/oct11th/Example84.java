package oct11th;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Example84 {
	public static void main(String [] args) throws Exception{
		FileReader a=new FileReader("a.txt");
		//创建一个BufferedReader缓冲对象
		BufferedReader x=new BufferedReader(a);
		
		FileWriter b=new FileWriter("out.txt");
		//创建一个BufferedWriter缓冲对象
		BufferedWriter y=new BufferedWriter(b);
		
		String str;
		while((str=x.readLine())!=null) {	//每次读取一行文本,判断是否到文件末尾
			y.write(str);
			y.newLine();		//写入一个由操作系统生成的换行符(相当于\r\n)
		}
		
		x.close();   y.close();
	}
}
