package oct8th;

public class ExtremePC {
	public PC myPC;
	public ExtremePC(PC myPC) {
		this.myPC=myPC;
	}
	public void show() {
		myPC.show();
		System.out.printf(" NVIDIA GEFORCE RTX 2080Ti \n HyperX 1TB SSD M.2");
	}
}
