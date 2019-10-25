package oct12th;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Example89{
    public static void main(String[] args)throws Exception{
        FileOutputStream fos=new FileOutputStream("dataStream.txt");
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        DataOutputStream dos=new DataOutputStream(bos);
        dos.writeByte(12);
        dos.writeChar('1');
        dos.writeBoolean(true);
        dos.writeUTF("ようこそ!");
        dos.close();
        
        FileInputStream fis=new FileInputStream("dataStream.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);
        DataInputStream dis=new DataInputStream(bis);
        System.out.println(dis.readByte());
        System.out.println(dis.readChar());
        System.out.println(dis.readBoolean());
        System.out.println(dis.readUTF());
        dis.close();
    }
}