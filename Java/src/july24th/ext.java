package july24th;
class ext{
    public void finalize(){//相当于VB的退出前事件(返回类型为void,public修饰可访问性)
        //方法名称必须为"finalize"
        System.out.println("对象将被作为垃圾回收.[来自对象释放方法(事件)的通知]");
    }
    
}