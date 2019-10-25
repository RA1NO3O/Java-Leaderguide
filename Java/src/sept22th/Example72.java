package sept22th;

public class Example72 {

	public static void main(String[] args) {
		CachePool<Integer>pool=new CachePool<Integer>();
		//👆在实例化pool对象时,传入参数为Integer类型
		pool.save(new Integer(923));

		Integer temp=pool.get();
		System.out.println(temp);
	}
}

