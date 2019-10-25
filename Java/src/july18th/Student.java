//类的封装
package july18th;
public class Student{
    private String name;
    private int age;
    public String getName(){
        return name;
    }
    public void setName(String stuName){
        name=stuName;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int stuAge){
        if(stuAge<=0){
            System.out.println("年龄的格式不正确OvO");

        }else{
            age=stuAge;
        }
    }
    public void introducing(){
        System.out.printf("我叫%s,今年%d岁惹!\n",name,age);
    }
}