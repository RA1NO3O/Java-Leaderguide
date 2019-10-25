package oct13th;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Example90 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps=new PrintStream(new FileOutputStream("printStream.txt"),true);
        Student stu=new Student();
        ps.print("这是一个数字:");
        ps.println(18);
        ps.println(stu);
    }
}