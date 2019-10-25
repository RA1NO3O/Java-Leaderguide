//Collections工具类
package sept24th;
import java.util.*;
public class Example75 {
	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		Collections.addAll(a, "C","Z","B","K");
		System.out.printf("a集合:\n排序前:"+a+"\n");
		
		Collections.reverse(a);
		System.out.println("反转排序后:"+a);
		
		Collections.sort(a);
		System.out.println("按自然排序后:"+a);
		
		Collections.shuffle(a);
		System.out.println("洗牌后:"+a);
		
		ArrayList<Integer> b=new ArrayList<Integer>();
		Collections.addAll(b, -3,2,9,5,8);
		System.out.printf("b集合:\n中的元素为:"+b+"\n");
		System.out.printf("集合中的最大元素:%d\n",Collections.max(b));
		System.out.printf("集合中的最小元素:%d\n",Collections.min(b));
		Collections.replaceAll(b, 8,0);
		System.out.println("替换后的集合:"+b);
	}
}
