package aug9th;
public class Example30{
    public static void main(String[] args){
        try{
            int result=x(4,-2);
            System.out.println(result);
        }catch(DivideByMinusException e){
            System.out.println(e.getMessage());
        }
    }
    public static int x(int a,int b)throws DivideByMinusException{
        if(b<0){
            throw new DivideByMinusException("错误:被除数是负数.");
        }
        int result = a / b;
        return result;
    }
}