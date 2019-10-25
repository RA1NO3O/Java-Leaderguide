package oct8th;

public class PC {
	private String PCName;
	public PC(String PCName) {
		this.PCName=PCName;
	}
	public void show() {
		System.out.printf(PCName+" \n AMD FX-8300 Quad-Core Processor \n AMD Radeon  HD 7870 \n WD 500GB HDD SATA \n");
	}
}
