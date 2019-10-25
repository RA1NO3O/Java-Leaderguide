package sept22th;
import java.util.*;
public class Example70 {
	public static void main(String[] args)throws Exception{
		Scanner b=new Scanner(System.in);
		System.out.println("请输入ID:");
		String id=b.next();
		String name=sos(id);
		System.out.printf("找到用户:%s.",name);
		b.close();
	}
	public static String sos(String b){
		Map<String, String> a=new HashMap<String, String>();
		//👆要想消除警告,就要为集合指定泛型.
		a.put("1","秋天");
		a.put("2", "橘子");
		a.put("3", "搞黄色");
		return (String) a.get(b);
	}
}
