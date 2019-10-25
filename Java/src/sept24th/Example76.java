//Arrays工具类
package sept24th;
import java.util.Arrays;
public class Example76 {
	public static void main(String[] args) {
		int[] arr= {9,8,3,5,2};
		System.out.println("排序前:");
		printArray(arr);//自定义方法(jump 39行)
		Arrays.sort(arr);
					//👆将数组中的元素按升序重新排序(排序规由相应的数组类型方法提供)
		System.out.println("按升序排序后:");
		printArray(arr);
		
		int index=Arrays.binarySearch(arr, 3);
									//※ 👆在指定数组中查找元素,返回下标(int)
		System.out.println("数组排序后元素3的下标是"+index);
		
		int[] copied=Arrays.copyOfRange(arr,1,7);
											//👆从指定数组中拷贝出第1个下标开始到第7个下标前的部分元素(不足以初始值补全)
		System.out.printf("数组拷贝后的元素为: ");
		for(int i=0;i<copied.length;i++) {
			System.out.print(copied[i]+" ");
		}
		
		Arrays.fill(copied, 8);
				//👆将指定数组以指定元素遍历覆盖
		System.out.printf("\n数组填充后的元素为: ");
		for(int i=0;i<copied.length;i++) {
			System.out.print(copied[i]+" ");
		}
		System.out.println();
		
		String arrString=Arrays.toString(copied);
		System.out.print("数组转化为字符串后的元素为: ");
		System.out.println(arrString);
		
	}

	private static void printArray(int[] arr) {
		System.out.print("[");
		for(int x=0;x<arr.length;x++) {
			if(x!=arr.length-1) {	//判断此次循环是否为最后的下标,决定合适的输出内容
				System.out.print(arr[x]+",");
			}else {
				System.out.println(arr[x]+"]");
			}
		}
	}
}
/* 注意:
 	※处使用的方法只会在排序后的数组起有效的作用.因为该方法的工作原理并非冒泡法,而是二分法.
 */
