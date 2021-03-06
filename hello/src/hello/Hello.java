package hello;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Collections; // 引入 Collections类,即集合类
import javax.swing.JTable;
//idea的话先在JTable找到TableModel接口，点一下，按住alt+enter
//		选择implement interface，再选择kcb这个包就行了

public class Hello {// public类的类名Hello必须和java文件名相同

    public static int cjk(int a, int b) {// 自定义static函数,调用可以直接cjk(a,b);而不需要object_name.cjk(a,b);
        return a * b;
    }

    public static void main(String[] args) {
        /************************** 输入输出 ****************************************/
        Scanner in = new Scanner(System.in);// 定义扫描
        String s;
//		final int num;//定义常量
        int num = 3;
//		s = in.nextLine();//输入一行what is this,s为"what is this"
//		s = in.next();//输入一行what is this,s为"what"
//		num = in.nextInt();//输入int型数字

//		System.out.println("2+"+num+"="+2+num);//输出"2+3=23\n"		
//		System.out.println("2+"+num+"="+(2+num));//输出"2+3=5\n"
//		System.out.print("2+"+num+"="+(2+num));//输出"2+3=5"
//		System.out.printf("%d",num);//与C语言一样
        /************************** if判断 ****************************************/
        if (num > 1)
            System.out.println(">");
        else if (num < 1)
            System.out.println("<");
        else {
            System.out.println("=");
            System.out.println("");
        }
        /************************ 多路分支 ******************************************/
        //
        switch (num) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("default");
        }
        /************************** 循环 ****************************************/
        // 循环1
        while (1 > 0) {
            break;
        }
        // 循环2
        do {
            System.out.println("");
        } while (1 == 0);
        // 循环3
        for (int i = 1; i >= 0; i--) {
            System.out.println("");
        }
        /************************** 布尔变量 ****************************************/
        boolean a = true;// 逻辑类型,即布尔类型
        boolean b = false;
        // System.out.println(!a); //a&&b,a||b
        /*************************** 数组 ***************************************/
        int[] numbers = new int[3];// numbers[i]:i=0~2
        int[] scores = {1, 2};
        System.out.println(numbers.length + scores.length);
        int[] new_numbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++)
            new_numbers[i] = numbers[i];// #数组赋值,只能循环不能直接让b=a
        for (int k : numbers)// for-each循环,只有数组才能这样枚举
            // 遍历numbers数组元素,k即为各个元素
            k = 2 * k;//
        int[][] two_numbers = new int[3][3];
        int[][] two_scores = {{1, 2, 3}, {4, 5, 6}};
        /*************************** Math ***************************************/
        int i = Math.abs(-12);
        double j = Math.round(12.45);
        j = Math.random();// j=0~1
        j = Math.pow(2, j);// 2**j
        /*************************** 字符(串) ***************************************/
        char c = 'a';// c++即为'b','A'-'a'=32,
        String d = "hello,world!";
        String e = "hello,china!";
//		c.equals(d);比较大小
//		d.compareTo(e);//相当于d-e:d>e为正,d=e为0,d<e为负
//		d.compareToIgnoreCase(e);//不区分大小写的比较
//		a.length;//字符串长度
//		d.charAt(0)//返回第一个字符0,不能用d[0]
//		d.substring(3);得到位置3到末尾的全部内容
//		d.substring(0,3);//得到从位置0到位置3的全部内容(不包含3)
//		d.indexOf(c);//得到字符(串)c所在位置,-1表示不存在
//		d.indexOf(c,3);//从位置3开始寻找字符(串)c所在位置,-1表示不存在
//		d.startsWith("ok");//返回布尔值,d是否以"ok"开头
//		d.endsWith("ok");//返回布尔值,d是否以"ok"结尾
//		d.trim();//去掉字符串两边的空格
//		d.replace(oldChar, newChar);//new替换old
//		d.toLowerCase();//字符串内所有字符变成小写
//		d.toUpperCase();//字符串内所有字符变成大写
        /*************************** ArrayList ***************************************/
        ArrayList<String> sites = new ArrayList<String>(); // 初始化
        sites.add("Google");
        sites.add("Runoob");// 添加元素
        sites.set(1, "Wiki"); // 修改元素
        // sites.remove(1);//删除元素
        System.out.println(sites);// 输出
        sites.get(1);// 访问第1个元素
        Collections.sort(sites); // 排序
        int sites_size = sites.size();// 计算大小
        // 具体看csdn的java笔记

        /*************************** HashSet ***************************************/
        HashSet<String> sss = new HashSet<String>(); // 初始化
        // HashSet与ArrayList基本一致,但是因为是集合,所以内部添加的各个对象会自动去重.
        /*************************** HashMap ***************************************/
        // hash表
        HashMap<Integer, String> coinnames = new HashMap<Integer, String>();
        coinnames.put(1, "penny");// 添加元素
        coinnames.put(10, "dime");
        coinnames.put(25, "quarter");
        coinnames.put(50, "half-dolar");
        System.out.println(coinnames);
        Collection tmp = coinnames.keySet();// 提取key转换成列表
        System.out.println(tmp);
        /***************************异常***************************************/
        try {
            numbers[999] = 10;
        } catch (ArrayIndexOutOfBoundsException error_first) {
            //第1种异常处理
            System.out.println("999 is too large!");
        } catch (BootstrapMethodError error_second) {
            //第2种异常处理
            System.out.println("999 is too large!");
        }
        finally{
            System.out.println("");//进入try或catch语句之后,最后都肯定要进finnaly
        }
    }
}
