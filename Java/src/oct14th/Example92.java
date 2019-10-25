package oct14th;

import java.io.IOException;

public class Example92 {
    public static void main(String[] args) throws IOException {
        StringBuffer sb=new StringBuffer();
        int ch;
        //循环遍历键盘输入的数据
        while((ch=System.in.read())!=-1){
            //对输入的字符进行判断,如果是回车或换行则跳出循环
            if(ch=='\r'||ch=='\n'){
                break;
            }
            sb.append((char)ch);    //将读取到的数据转换成字符添加到sb中
        }
        System.out.println(sb);
    }
}