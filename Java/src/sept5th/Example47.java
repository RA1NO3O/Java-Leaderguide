//currentTimeMills()方法
package sept5th;
public class Example47{
    public static void main(String[] args){
        long startTime=System.currentTimeMillis();
        for(int i=0;i<100000000;i++){
        }
        long endTime=System.currentTimeMillis();
        System.out.printf("程序运行的时间为:%d毫秒",endTime-startTime);
                                                //👆计算两次调用方法的时间差就得出程序的运行时间
    }
}
//currentTimeMillis()方法会返回一个long类型的值,该值会表示当前时间与1970/1/1 00:00:00之间的时间差,单位为毫秒.
//它有另一个讲法,叫"时间戳".