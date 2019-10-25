package aug27th;
public class Example38{
    public static void main(String[] args){
        Storage st=new Storage();
        Input a=new Input(st);
        Output b=new Output(st);
        new Thread(a).start();
        new Thread(b).start();
    }
}