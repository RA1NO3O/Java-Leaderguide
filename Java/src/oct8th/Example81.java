package oct8th;
import java.io.*;
public class Example81 {

	public static void main(String[] args)throws Exception {
		BufferedInputStream a=new BufferedInputStream(new FileInputStream("TenFiftySeven.txt"));
		BufferedOutputStream b=new BufferedOutputStream(new FileOutputStream("TenFiftyEight.txt"));
		
		int len;
		while((len=a.read())!=-1) {
			b.write(len);
		}
		
		a.close();
		b.close();
	}

}
