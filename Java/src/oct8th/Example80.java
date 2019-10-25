package oct8th;

public class Example80 {

	public static void main(String[] args) {
		PC desktop=new PC("ASUS");
		System.out.println("--------------------------升级前--------------------------");
		desktop.show();
		ExtremePC studio=new ExtremePC(desktop);
		System.out.println("--------------------------升级后--------------------------");
		studio.show();
	}

}
