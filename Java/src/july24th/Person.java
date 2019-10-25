//this 关键字
package july24th;
class Person{        
    int c=0;//
    int c1=0;//
    public Person(){
        c++;//
        System.out.printf("第%d次调用无参构造方法.\n",c);
    }
    public Person(String name){//RELOAD 
        this();//相当于Person(),在构造方法里调用了自己的无参数构造方法.
        c1++;//

        System.out.printf("第%d次调用有参构造方法.",c1);
    }
}