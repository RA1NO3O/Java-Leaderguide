package sept16th;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
public class Example68{
    public static void main(String[] args) {
        TreeMap<String, String> a=new TreeMap<String, String>();
        a.put("1","Jack");
        a.put("3", "Lucy");
        a.put("2","Rose");
        Set<String> b=a.keySet();
        Iterator<String> c=b.iterator();
        while(c.hasNext()){
            Object key=c.next();
            Object value=a.get(key);
            System.out.println(key+":"+value);
        }
    }
}