//arraycopy()方法
package sept6th;
public class Example48{
    public static void main(final String[] args){
        final char[] fromArray={'a','b','c','d'};//源数组
        final char[] toArray={'z','y','x','w'};//目标数组
        System.arraycopy(fromArray, 1, toArray, 2, 2);
        for(int i=0;i<toArray.length;i++){
            System.out.println(i+":"+toArray[i]);
        }
    }
}
//arraycopy()方法用于将一个数组中的元素快速拷贝至另一个数组,它也属于System类的方法.
//格式:                                                         👇拷贝元素的个数
//arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
//                 👆源数组  |            👆目标数组  👆拷贝到目标数组的起始位置
//                          👆原数组中拷贝元素的起始位置

//Mr.🦄说:"要注意arraycopy()方法中起始位置也是和数组下标一样从0开始哦."