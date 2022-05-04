package hello;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("hello world");
//        byte[] buffer = new byte[1024];
//        try {
//            int len = System.in.read(buffer);//流输入
//            String s = new String(buffer, 0, len);
//            System.out.println("读到了" + len + "字节");
//            System.out.println(s);
//            System.out.println("s的长度是:" + s.length());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        try{
//            //DataInputStream和DataOutputStream用以读写二进制方式表达的基本数据类型的数据
//            //DataOutputStream,BufferedOutputStream和FileOutputStream共三个流过滤器
//            DataOutputStream out = new DataOutputStream((
//                    new BufferedOutputStream(
//                            new FileOutputStream("a.dat")//最终cafebabe将写入a.dat
//                    )
//                    ));
//            int i = 0xcafebabe;//使用二进制形式写入文件,和printf不一样,因为这是直接每一位的二进制对应,不会涉及到10/16进制转换之类的工作
//            out.writeInt(i);
//            out.close();
//        }catch(FileNotFoundException e){
//            e.printStackTrace();
//        }catch (IOException e){
//            e.printStackTrace();
//        }


        // 二进制数据采用InputStream/OutputStream
        // 文本数据采用Reader/Writer(处理Unicode文件,但是现在文本多为ASCII,utf-8等形式,
        // 所以需要借助Stream,让Stream打开文件,然后在Stream上通过流过滤器的方式建立read/write进行文本的输入输出)
//        try {
//            PrintWriter out = new PrintWriter((
//                    new BufferedWriter(
//                            new OutputStreamWriter(
//                                    new FileOutputStream("a.txt")))));//把123465写入a.txt
//            int i = 123465;
//            out.println(i);
//            out.close();
//            ///////////////////////////////////////////////////////////////////
//            BufferedReader in = new BufferedReader(
//                    new InputStreamReader(
//                            new FileInputStream("src/hello/Main.java")));//如果是中文应该在FileInputStream中加上"utf8"
//            String line;
//            line = in.readLine();
//            while (line != null) {
//                System.out.println(line);//输出代码的内容
//                line = in.readLine();
//            }
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


    }
}
