package sept29th;
import java.io.FileInputStream;
public class Example77{
    public static void main(String[] args) throws Exception {
        FileInputStream a=new FileInputStream("a.txt");
        int b=0;
        while(true){
            b=a.read();
            if(b==-1){
                break;
            }
            System.out.print(b+" ");
        }
        a.close();
    }
}