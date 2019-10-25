//构造方法的重载(6-12行)
package july21th;
class Person{
    String name;
    int survive_days;
    public Person(String a,int b){
        name=a;
        survive_days=b;
    }
    public Person(String a){
        name=a;
    }
    public void speak(){
        if (survive_days==0){
            survive_days=6989;
        }
        System.out.printf("Welcome back %s , You've survive %d days!\n",name,survive_days);
    }
}