package oct10th;
public class Logcat extends Backcat{
    public static void main(String[] args) throws Exception {
        Startup();
        Menu(0);
    }

    static void Menu(int kind) throws Exception {
        switch(kind){
            case 0://初始界面
                System.out.println("*********************************");
                System.out.println("*             Welcome           *");
                System.out.println("*      1.LOGIN                  *");
                System.out.println("*      2.EXIT                   *");
                System.out.println("*                               *");
                System.out.println("*********************************");
                Order(0);
            break;

            case 1://登录界面
                System.out.println("*********************************");
                System.out.println("*           You're in.          *");
                System.out.println("*      1.LOGOUT                 *");
                System.out.println("*      2.CHECK LOG              *");
                System.out.println("*                               *");
                System.out.println("*********************************");
                Order(1);
            break;

            case 2://登出后界面
                System.out.println("*********************************");
                System.out.println("*         You're out now.       *");
                System.out.println("*      1.LOGIN                  *");
                System.out.println("*      2.EXIT                   *");
                System.out.println("*                               *");
                System.out.println("*********************************");
                Order(0);
            break;

            case 3://日志界面
                System.out.println("事件名称                   日期   ");
                System.out.println("*********************************");
            break;

        }
    }
}