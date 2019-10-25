package oct10th;

import java.io.*;
import java.util.Date;
import java.util.Scanner;
public class Backcat{
    static Scanner in = new Scanner(System.in);
    public static void Order(int kind) throws Exception {
        int cmd=in.nextInt();
        switch(kind){
            case 0:
                switch(cmd){
                    case 1:
                        Login();
                    break;
                    case 2:
                        writeLog("关闭Logcat");
                        System.exit(0);    
                    break;
                    default:
                        System.out.println("指令错误,请重试.");
                        Logcat.Menu(0);
                    break;
                }
            break;
            
            case 1:
                switch(cmd){
                    case 1:
                        Logout();
                    break;
                    case 2:
                        CheckLog();
                    break;
                    default:
                        System.out.println("指令错误,请重试.");
                        Logcat.Menu(1);
                    break;
                }
            break;
            
            case 2:
                switch(cmd){
                    case 1:
                        System.out.println("Are u sure? (y/n)");
                        if(in.next().equals("y")){
                            FileWriter a=new FileWriter("logcat.log");
                            String x="";
                            a.write(x);
                            a.close();
                        }else{
                            CheckLog();
                        }
                    break;

                    case 2:
                        Logcat.Menu(1);
                    break;
                }
            break;
        }
    }
    public static void Login() throws Exception {
        //在此处填入日志写入登录事件相关代码:
        writeLog("用户登入");
        Logcat.Menu(1);
    }
    public static void Logout() throws Exception {
        //在此处填入日志写入登出事件相关代码:
        writeLog("用户登出");
        Logcat.Menu(2);
    }
    public static void CheckLog() throws Exception {
        //在此填入查看并输出日志相关代码
        Logcat.Menu(3);
        System.out.println("*********************************");
        System.out.println("1.CLEAR LOG                2.BACK");
        Order(2);
    }
    public static void Startup() throws Exception {
        writeLog("启动Logcat");
    }
    public static void writeLog(String detail)throws Exception{
        Date now=new Date();
        FileWriter a=new FileWriter("logcat.log",true);
        String writeLine=detail+"    "+now;
        a.write(writeLine);
        a.write("\r\n");
        a.close();
    }
}