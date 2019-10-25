package oct12th;

import java.io.Serializable;

class Person implements Serializable{
    private String id;
    private String name;
    private int age;
    public Person(String id,String name,int age){
        super();
        this.id=id;
        this.name=name;
        this.age=age;
    }
    public String getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}