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
//            int len = System.in.read(buffer);//������
//            String s = new String(buffer, 0, len);
//            System.out.println("������" + len + "�ֽ�");
//            System.out.println(s);
//            System.out.println("s�ĳ�����:" + s.length());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        try{
//            //DataInputStream��DataOutputStream���Զ�д�����Ʒ�ʽ���Ļ����������͵�����
//            //DataOutputStream,BufferedOutputStream��FileOutputStream��������������
//            DataOutputStream out = new DataOutputStream((
//                    new BufferedOutputStream(
//                            new FileOutputStream("a.dat")//����cafebabe��д��a.dat
//                    )
//                    ));
//            int i = 0xcafebabe;//ʹ�ö�������ʽд���ļ�,��printf��һ��,��Ϊ����ֱ��ÿһλ�Ķ����ƶ�Ӧ,�����漰��10/16����ת��֮��Ĺ���
//            out.writeInt(i);
//            out.close();
//        }catch(FileNotFoundException e){
//            e.printStackTrace();
//        }catch (IOException e){
//            e.printStackTrace();
//        }


        // ���������ݲ���InputStream/OutputStream
        // �ı����ݲ���Reader/Writer(����Unicode�ļ�,���������ı���ΪASCII,utf-8����ʽ,
        // ������Ҫ����Stream,��Stream���ļ�,Ȼ����Stream��ͨ�����������ķ�ʽ����read/write�����ı����������)
//        try {
//            PrintWriter out = new PrintWriter((
//                    new BufferedWriter(
//                            new OutputStreamWriter(
//                                    new FileOutputStream("a.txt")))));//��123465д��a.txt
//            int i = 123465;
//            out.println(i);
//            out.close();
//            ///////////////////////////////////////////////////////////////////
//            BufferedReader in = new BufferedReader(
//                    new InputStreamReader(
//                            new FileInputStream("src/hello/Main.java")));//���������Ӧ����FileInputStream�м���"utf8"
//            String line;
//            line = in.readLine();
//            while (line != null) {
//                System.out.println(line);//������������
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
