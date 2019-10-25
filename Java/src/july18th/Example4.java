package july18th;
import java.util.Scanner;
public class Example4{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Student stu = new Student();
        System.out.println("请输入年龄");
        stu.setAge(in.nextInt());
        System.out.println("请输入名字");
        stu.setName(in.next());
        in.close();
        stu.introducing();
    }
}
