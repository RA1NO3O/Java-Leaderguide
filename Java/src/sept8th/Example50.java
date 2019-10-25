package sept8th;
public class Example50{
    public static void main(String[] args) throws Exception {
    //exec方法会抛出IOException类异常,sleep方法又会抛出InterruptedException类异常,所以此处干脆直接抛出了父类Exception来处理.
        Runtime rt=Runtime.getRuntime();
        System.out.println("即将打开:计算器");
        //👇进程类
        Process a=rt.exec("calc.exe");
                    //👆打开了Windows系统中自带的计算器程序.
        Thread.sleep(3000);
                //👆等待3秒
        a.destroy();
          //👆摧毁进程a,也就是结束计算器的进程.
        
    }
}
//exec()方法也是Runtime类的一员,有了exec()方法,就可以通过java执行本地进程了.
//使用exec()方法时,要考虑到针对不同的操作系统特性来编写代码.
//譬如,在Windows上的文件资源管理器"explorer.exe"程序要想在Linux中执行是不可能的.
//Linux系统中没有包含这个程序,也不支持运行.exe格式的程序.
//PS:由于Mac系统的特性,使用exec()方法调用起来十分不方便.因为Mac的程序运行权限管理太严格了👎

//新发现:destroy()方法对于Windows平台上的UWP应用无效,只能结束Win32应用程序.