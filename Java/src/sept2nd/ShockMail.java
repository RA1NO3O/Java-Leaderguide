package sept2nd;
import java.util.Scanner;
public class ShockMail{
    public static void main(String[] args){

        //初始化
        String mailAddress="";
        String passWord="";
        Scanner in=new Scanner(System.in);

        //绘制界面
        System.out.println("***********************************************");
        System.out.println("*                                             *");
        System.out.println("*                  ShockMail                  *");
        System.out.println("*                                             *");
        System.out.println("***********************************************");

        //交互和处理        
        do{
            do{
                System.out.println("Mail Address: ");
                mailAddress=in.next();
                mailAddress.toLowerCase();//后处理
                if(mailAddress.contains("@")==false||mailAddress.length()<5){
                    System.out.println("Error: Invalid mail Address.");
                }
            }while(mailAddress.contains("@")==false);

            do{
                System.out.println("Password: ");
                passWord=in.next();
                if(passWord.length()<6){
                    System.out.println("Error: invalid password.");
                }
            }while(passWord.length()<6);

            if(mailAddress.toLowerCase().equals("dual@shock.com")&&passWord.equals("abc123")){
                String[] Username=mailAddress.split("@");
                System.out.printf("Welcome, %s.",Username[0].toUpperCase());
                System.out.printf("您的电子邮件后缀: @%s",Username[1]);
            }else{
                System.out.println("Error:Incorrect mail address or password combination.");
            }
        }while((mailAddress.toLowerCase().equals("dual@shock.com")&&passWord.equals("abc123"))==false);
        
        //收尾
        in.close();
    }
}