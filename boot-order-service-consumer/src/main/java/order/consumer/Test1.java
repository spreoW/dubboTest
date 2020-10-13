package order.consumer;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author wangquan
 * @date 2020/10/7
 */
public class Test1 {
    public static void main(String[] args) {

        /*实例化一个文件，代表给定路径的文件或目录
        *
        * 路径的描述不同的文件系统差异较大
        * linux和windows就不同
        * 最好使用相对路径，不要用绝对路径
        * "."代表的路径:相对路径，当前路径:项目所处的目录
        * File.separator:目录分隔符
        *
        * 创建该对象并不意味着硬盘上对应路径上就有该文件了，
        * 只是在内存中创建了该对象去代表路径指定的文件。当然这个
        * 路径对应的文件可能根本不存在
        *
        * */
        for (int i = 104; i < 125; i++) {
            File file = new File("H:\\16G默认新资源\\" + File.separator + i+".mp4");
            /*  String string="D:"+File.separator+"hahahaha.txt";
        File file=new File(string);更改用户系统的权限问题*/

            //判断该文件是否在硬盘中真实存在
            if (!file.exists()) {
            /*
            *创建file代表的文件
            * 调用该文件后，硬盘中就会存在该文件了
            * 这里要求强制捕获异常！ creatNewFile有throws声明
            *
            * */
                try {
                    file.createNewFile();
                    System.out.println("创建文件成功了");
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("创建文件失败了");

                }
            }
            // 结果创建文件成功了
        }
    }
}
