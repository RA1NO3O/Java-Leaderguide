//try{}catch(){}和finally{}
package aug7th;
public class Example28{
    public static void main(String[] args){
        try{
            int result =divide(4,0);
            System.out.println(result);
        }catch (Exception e){
            System.out.printf("New Captured Error Message:\n%s\n",e.getMessage());
        }finally{
        System.out.println("Application now will end running.");
        }
    }
    public static int divide(int x,int y){
        int result=x/y;
        return result;
    }
}
//在Example27中,由于发生了异常,程序立刻终止,无法继续向下运行.
//受Java系统的限制,Error级的错误无法catch,发生Error时会无条件结束程序.
//若要求程序在发生某些异常后继续运行,可以使用try{}语句
//格式:
/*
try{
    * 要尝试的代码
}catch(Exception(子)类 e){
//     👆异常类型,在不确定错误类型的场合可直接选用Exception父类
//       但是,这么做会导致在含有多个catch代码块的情况下难以精确定位异常类型.

    * 在发生ExceptionType时执行的代码
}finally{
    * 在try或一切catch都结束之后执行的代码

    //在多数开发工作中,finally多用做收尾等必须完成的工作.
}
*/
// * 需知悉的是,在try中产生异常后,try代码块将不再执行.
// * 其中,catch和finally可只写其一.
// * 在catch中使用"return;"时,将会结束当前方法.
//   但是,finally代码块不受影响.
//
