package july22th;

import java.util.Scanner;
import java.util.Date;                                                      //导入"日期"包
import java.text.SimpleDateFormat;                                          //导入"简单日期格式"包

public class DMPS{
    public static void main(String[] args){
        //程式初始化
        int round=0;                                                        //循环次数(供多次输入)
        String a="";                                                        //循环条件(供退出&结算)
        int n=0;                                                            //商品数量
        double total=0.0;                                                   //用于储存总价(供累加)
        String[] printList=new String[100];                                 //用于输出的数组(最多100个应该够用了叭)
        Scanner in = new Scanner(System.in);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  //初始化时间格式
        
        //交互部分
        System.out.println("*********销售系统**********");
        System.out.println("销售时间:"+df.format(new Date()));               // new Date()为获取当前系统时间
        
        do{
            System.out.println("请输入物品编号:(1-3)");
                int b=in.nextInt();
                double unitprice=productID(b);
                String productname=ProductName(b);
            System.out.println("请输入物品数量:");
                n=in.nextInt();
                total+=unitprice*n;
                
                //储存信息以便稍后的输出
                printList[round]=productname+"     "+Double.toString(unitprice)+"      "+Integer.toString(n);

            do{                                                                //等待用户响应循环
                System.out.println("是否继续输入?(y/n)");
                a=in.next();
            }while((a.equals("y")||a.equals("n"))==false);
            round++;
        }while(a.equals("y"));
        
        //打印收据
        System.out.println("商品名称       单价       数量");
        System.out.println("------------------------------");
        for(int i=0;i<round;i++){
            System.out.println(printList[i]);
        }
        System.out.println("------------------------------");
        System.out.printf("                     合计:%.2f\n",total);
        System.out.println("*请在食品赏味期限内食用完毕.");
        System.out.println("多谢惠顾,期待下次光临嗷喵 =ω=");
        System.out.println("https://github.com/RA1NN1AR");
        System.out.println("******************************");
        in.close();
    }
    
    //后端部分
    public static double productID(int a){//获取编号,返回单价(第26行).
        double unitprice=0.0;
        switch(a){
            case 1:
                unitprice=12.34;            
            break;
                
            case 2:
                unitprice=56.78;
            break;

            case 3:
                unitprice=90.00;
            break;
        }
        return unitprice;
    }
    public static String ProductName(int a){//获取编号,返回商品名称(第27行).
        String productName = new String();
        switch(a){
            case 1:
                productName="竹笋山脉(盒)";
            break;
                
            case 2:
                productName="巧克力螺(盒)";
            break;

            case 3:
                productName="杨梅(箱)   ";
            break;
        }
        return productName;
    }
}