//自定义泛型
package sept22th;

class CachePool<T> {
	//					   👆名称任意
	T temp;
	public void save(T temp) {
		this.temp=temp;
	}
	public T get() {
		return temp;
	}
}
/*
 自定义泛型是一个容器,用于缓存程序中的某个值.
 自定义泛型中必须要定义save()和get()方法,用于保存和取出数据.
 格式:
 class 泛型类名称{
 	void save(参数类型 参数){
 
 	}
 	返回值类型 get(){
 
 	}
 }
 为了能存储任意类型的对象,save()方法的参数应定义为Object类型,get()亦是如此.
 但请明白一点,这么做也会导致"忘记"当初存储的类型.导致程序发生错误.
 
 这种时候,就可以在类名后添加泛型来解决,并将save()和get()的返回值类型也与其对应.
 这样一来,容器中只能存入这种类型的元素,取出时就无需进行类型转换了.
  */