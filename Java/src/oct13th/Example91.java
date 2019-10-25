package oct13th;

import java.io.IOException;

public class Example91 {
    public static void main(String[] args) throws IOException {
        StringBuffer sb=new StringBuffer();
        int ch;
        //while循环用于读取键盘输入的数据
        while((ch=System.in.read())!=-1){
            //对输入的字符进行判断,如果是回车"\r"或者换行"\n",则跳出循环
            if(ch=='\r'||ch=='\n'){
                break;
            }
            sb.append((char)ch);    //将读取到的数据添加到sb中
        }
        System.out.println(sb);     //输出键盘输入的数据
    }
}