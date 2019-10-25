/**
 * Title:doc类<br>
 * Description:通过doc类来说明Java中の文档注释<br>
 * Company:Comming Soon™
 * @author Itcast
 * @version 1.0.0
 */
package july28th;
class doc{
public String name;
    /**
     * 这是doc类の构造方法
     * @param name 名字
     */
    public doc(String name){
    }
    /** 
     * 这是read()方法の说明
     * @param bookname 书本名称
     * @param time 阅读时间
     * @return 读书数量
     */
    public int read(String bookName,int time){
        return time;
    }
}
//文档注释是嵌入到程序中の帮助信息,类似说明书一般の存在.
//使用javadoc命令可以将代码文件中の文档注释提取出来,并生成HTML格式の网页.
//开发者可以借助帮助文档了解程序の功能,而无需研究程序の源代码.
//将程序文档化,能有效地提高团队开发效率.

//文档注释の格式:
//以" /** "开头,以" */ "结束
//且这对标记间の文档注释の每行开头都有" * "

//在文档中出现过の"@"含义:
//@author:用于对类の说明,表示这个程序の作者.
//@version:用于对类の说明,表示这个程序の版本号.
//@param:用于对方法の说明,表示方法定义の参数以及参数对应の说明.
//@return:用于对方法の说明,表示方法の返回值代表の意义.

//javadoc命令使用格式:
//javadoc -d . -version -author doc.java
//说明:
//"-d"命令用来指定输出文档の存放目录, " . " 表示当前终端所在目录下.
//"-version"命令用来指定为输出文档中添加包含版本信息
//"-author"命令用来指定为输出文档中添加包含作者信息