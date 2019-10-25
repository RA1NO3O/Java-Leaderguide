package oct12th;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Example88{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis=new FileInputStream("objectStream.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        //从 objectStream.txt中读取Person对象
        Person p=(Person) ois.readObject();
        System.out.println("--------------从文件中读取后--------------");
        System.out.println("Person对象的id:"+p.getID());
        System.out.println("Person对象的name:"+p.getName());
        System.out.println("Person对象的age:"+p.getAge());
    }
}