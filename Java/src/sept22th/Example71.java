//泛型的使用
package sept22th;
import java.util.ArrayList;
public class Example71 {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("String");
		a.add("Collection");		
		for(Object b : a) {	//相当于for(int b=0;b<a.length;b++)
			System.out.println(b);
		}
	}

}
/*虽然集合可以存储任何类型的对象,但是当把一个对象存入集合后,集合会忘记这个对象的类型,将该对象从集合中取出时,这个对象的编译类型就变成了Object类型.
  换言之,在程序中无法确定一个集合中的元素到底时什么类型的.会导致在取出元素时进行强制类型转换容易出错.
  
  自JDK1.5之后,引入了参数化类型的概念(即泛型).它可以限定方法操作的数据类型.
  在定义集合类时,使用<参数化类型>可指定该类中方法操作的数据类型,
  格式:
  集合类型<参数化类型>对象名=new 集合类型<参数化类型>();

  设定好泛型之后的集合,便只能存储规定类型的元素.
  
*/


