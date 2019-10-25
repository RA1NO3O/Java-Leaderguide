package sept16th;

import java.util.Enumeration;
import java.util.Properties;

public class Example69{
    public static void main(String[] args) {
        Properties p=new Properties();
        p.setProperty("background-color", "gray");
        p.setProperty("Font-size", "12px");
        p.setProperty("Encoding", "UTF-8");
        Enumeration<?> names=p.propertyNames();
        while(names.hasMoreElements()){
            String key=(String) names.nextElement();
            String value=p.getProperty(key);
            System.out.println(key+"="+value);
        }
    }
}