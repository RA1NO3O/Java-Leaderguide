package oct12th;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Example87 {
    public static void main(String[] args) throws IOException{
        Person p=new Person("p1","小李",18);
        System.out.println("--------------写入文件开始--------------");
        System.out.println("Person对象的id:"+p.getID());
        System.out.println("Person对象的name:"+p.getName());
        System.out.println("Person对象的age:"+p.getAge());
        //创建文件输出流对象,将数据写入objectStream.txt文件中
        FileOutputStream fos=new FileOutputStream("objectStream.txt");
        //创建对象输出流对象,用于处理输出流对象写入的数据
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        //将Person对象输出到输出流中
        oos.writeObject(p);
        System.out.println("--------------写入文件结束--------------");
    }
}