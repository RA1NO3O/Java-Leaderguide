//getProperties()方法
package sept5th;
import java.util.*;
public class Example46{
    public static void main(String[] args){
        Properties a=System.getProperties();
        Enumeration<?> b=a.propertyNames();
        //👆Enumeration是一个接口,其中定义了一些方法,通过这些方法可以枚举（一次获得一个）对象集合中的元素.
        //这种传统接口已被迭代器取代,虽然Enumeration还未被遗弃,但在现代代码中已经被很少使用了.
        //尽管如此,它还是使用在某些传统类所定义的方法中.
        //除此之外,还用在一些API(应用程序接口)类,并且在应用程序中也广泛被使用.
        //(PS:因为是首次接触所以我也不知道为啥会划着黄色波浪线quq)
        while(b.hasMoreElements()){
            String key= (String) b.nextElement();
            String value=System.getProperty(key);
            System.out.printf("%s--->%s\n",key,value);
        }
    }
}
//系统类的getProperties()方法用于获取当前系统的全部属性,
//该方法会返回一个Properties对象,其中包含了系统的所有属性,这些属性是以键值对的形式存在的.