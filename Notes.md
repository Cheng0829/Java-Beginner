# 听课笔记

**1.IDE**

**①Eclipse**

**(1)** eclipse按 "ctrl" + "=" 就是放大, "ctrl" + "-" 就是缩小，

**(2)汉化:** 可以点“help”->“install new software”->“add”,name填babel,网址为https://mirrors.tuna.tsinghua.edu.cn/eclipse/technology/babel/update-site/latest/,然后等待2分钟抓取包,选择babel chinese(simplified),取消contact all updates,一直next即可

**(3)中英文切换:** 在快捷方式的目标栏中在"D:\elipse\eclipse.exe"后加上-nl en(或-nl zh)

**(4)安装卸载:** 在"窗口"->"安装/更新"中可以卸载软件

**(5)构造函数** eclipse点击源码->使用字段生成构造函数,即可生成与class同名的函数(相当于python的init),不必手动构造

**(6)格式化** 源码->格式化,可以把代码修改成标准格式

**②IDEA**

**(1)构造函数** 代码->生成->构造函数

**(2)格式化** 代码->重新格式化代码,可以把代码修改成标准格式

**(3)检查代码** 代码->检查代码,会自动生成代码的错误,警告以及建议的解决方案等

**(4) IDEA导入eclipse**

文件->新建->从现有源项目->添加目录(若目录下有多个项目则可直接添加父目录),然后不停"下一步"


**2.** java11以后没有单独的jre程序,集成到jdk程序中了

**3.** eclipse安装可能极慢,因为墙的原因部分包无法下载,可以用老版的压缩包,打开即用

**4.**  new a project -> new a class

**5.** shift + 方向键 : 批量选中代码

**6.** //和/**/是注释,"ctrl"+ "/"可以把一行代码进行注释/取消注释

**7.** 数组变量

**（1）**
```java
public class Hello {
	public static void main(String[] args) {
		int[] a = new int[3];
		a[0] = 1;
		int[] b = a;
		b[0] = 0;
		System.out.println(b[0]);//b[0]=0
		System.out.println(a[0]);//a[0]=0
		//a b都只是数组的管理者，而非数组本身，所以数组值改变时，看起来两个都变了
	}
}
```
**（2）**
```java
public class Hello {
	public static void main(String[] args) {
		int[] a = {1,2,3};
		int[] b = {1,2,3};
		int[] c = a;
		System.out.println(a==b);//false
		System.out.println(a==c);//true
		//数组变量之间的比较是判断是否属于同一个数组，而非值的比较
	}
}
```
**8.字符串**

字符串的比较与数组类似，“==”只能比较两个变量是否指向同一个字符串实例，值的比较应该用a.equals(b)

**9.函数参数**

java和c一样,在自定义函数中无法改变函数参数本身的变量的值(教科书中可能说的是改变形参不能改变实参,这是对的,但是形参实参这种称呼已经过时了,可称为参数和值)

**10. 三种输出:** Java的输出方式一般有这三种，print、println、printf。它们都是java.long包里的System类中的方法。

**(1)print**

print输出会自动将括号中的内容转换成字符串输出，如果括号中是一个对象的话，就会自动调用toString()方法。该输出方式不会换行。

**(2)println**

println与print的用法和作用基本相同，但是println的输出是换行的，它会自动的在输出结果后面加上换行符

**(3)printf**

printf是沿用了C语言中的部分输出方式，可以格式化输出。

```java
package tmp;
public class tmp {
	public static void main(String[] args) {
		int num=3;	
		System.out.println("2+"+num+"="+(2+num));//输出"2+3=5\n"
		System.out.print("2+"+num+"="+(2+num));//输出"2+3=5"
		System.out.printf("2+%d=%d",num,num);//与C语言一样,输出"2+3=5"
```

**10. 对象和类**

对象是实体,类是规范,根据类的定义来创建对象,

比如:类是"猫",那么对象就是"这只猫",类定义了猫的属性,可以用来定义变量

对象=数据+操作,数据:属性或状态,操作:函数

**11.** 对象变量和数组变量,字符串变量一样,只是实例的管理者,而非实例本身.

**12.** 引用同一项目下不同包的java文件中的类:(项目名为clock,package名分别为Clock和Display)

**clock.java:**
```java
import diskplay.Display//推荐
private Display hour = new Display(24);
```
或
```java
private diskplay.Display hour = new diskplay.Display(24);
```
**13. Static**

**(1)static变量:**

不同对象的static变量值保持一致 ,调用时可以是class_name.static_variable = XX,而不是object_name.static_variable = XX

**(2)static函数:**

调用时可直接写作function_name();而不需要object_name.function_name();

**14.ArrayList容器**

容器即Collection类,也可译为"集合",但与Set类重复,所以常说为容器.
```java
import java.util.ArrayList; 
ArrayList<String/Integer/...> name =new ArrayList<String/Interger/...>();
```
add()	将元素插入到指定位置的 arraylist 中

addAll()	添加集合中的所有元素到 arraylist 中

clear()	删除 arraylist 中的所有元素

clone()	复制一份 arraylist

contains()	判断元素是否在 arraylist

get()	通过索引值获取 arraylist 中的元素

indexOf()	返回 arraylist 中元素的索引值

removeAll()	删除存在于指定集合中的 arraylist 里的所有元素

remove()	删除 arraylist 里的单个元素

size()	返回 arraylist 里元素数量

isEmpty()	判断 arraylist 是否为空

subList()	截取部分 arraylist 的元素

set()	替换 arraylist 中指定索引的元素

sort()	对 arraylist 元素进行排序

toArray()	将 arraylist 转换为数组

toString()	将 arraylist 转换为字符串

ensureCapacity()	设置指定容量大小的 arraylist

lastIndexOf()	返回指定元素在 arraylist 中最后一次出现的位置

retainAll()	保留 arraylist 中在指定集合中也存在的那些元素

containsAll()	查看 arraylist 是否包含指定集合中的所有元素

trimToSize()	将 arraylist 中的容量调整为数组中的元素个数

removeRange()	删除 arraylist 中指定索引之间存在的元素

replaceAll()	将给定的操作内容替换掉数组中每一个元素

removeIf()	删除所有满足特定条件的 arraylist 元素

forEach()	遍历 arraylist 中每一个元素并执行特定操作

**15.HashSet容器**

HashSet与ArrayList基本一致,但是因为是集合,所以内部添加的各个对象会自动去重.

**16.向上造型**

子类对象可以赋值给父类对象,但父类对象不能赋值给子类对象

**17.Override**

覆盖,即告诉编译器,以下函数必须和父类的名字参数完全一样.
```java
@Override
public int test(Object a){
}
```
18.所有自定义类都是Object类的子类,也就可以用object的各种方法:
![在这里插入图片描述](https://img-blog.csdnimg.cn/c325c94ad4684d71b4dc5e1390309188.png)
**19.抽象**
抽象函数:表达概念而无法实现具体代码的函数
抽象类:表达概念而无法构造出实体的类
比如画一个圆,直线,可以有明确的代码,但是"画一个形状"是无法直接做到的,而且"画一个形状"包含了画圆和画直线
```java
package shapes;
import java.awt.Graphics;
public abstract class Shape {
	public abstract void draw(Graphics g);//抽象函数,表示"画一个形状",
	//当一个类中出现一个抽象函数,那么这个类就必须加上abstract
	public static void main(String[] args) {
		//Shapes s = new Shape();//报错,抽象类不能产生实例对象
	}
}
```
抽象类不能产生实例对象
抽象类的子类(比如Shapes的子类Line和Circle)必须实现(即覆写)父类中的抽象函数,否则他自己就变成抽象函数

**20.接口**

**(1)概念**

接口是纯抽象类,所有的成员函数都是抽象函数,所有的成员变量都是public static final,接口规定了长什么样，但是不管里面有什么
接口是隐式抽象的，当声明一个接口以及它的方法时，不必使用abstract关键字。同时接口中的方法都是公有的。
类用extends，接口用implements.类可以实现很多接口接口可以继承接口，但不能继承类接口不能实现接口.
接口和类的地位是一样的,可以把interface当作一个特殊的class,所有能出线clas是的地方都能出现interface

**(2)在定义接口后,类必须实现接口中的方法,否则编译会报错**

**Cell.java:**
```java
//Interface关键字用来声明一个接口
public interface Cell {
   public void move();
}
```
**Fox.java:**
```java
//Cell是Fox的接口
public class Fox implements Cell{
	public void move(){
	      System.out.println("Move!");
	   }
}
```
**(3)面向接口的编程方式:**
设计程序时先定义接口，再实现类.
任何需要在函数间传入传出的一定是接口而不是具体的类,这是Java成功的关键之一，因为极适合多人同时写一个大程序

**(4)接口的作用：**
接口是软件编程的规范，可以降低耦合性，换句话说，可以让某个模块或功能能够重复利用，这样只要写一次代码就ok了。其他地方要用到的，全部用接口调用来实现

**(5)困惑：** 定义接口之后，还要在对应的的类中写接口的实现方法，那为什么不直接就在这个类中写实现方法，而且这样还不需要定义接口?

**答:** 接口是一种规范,软件开发大多是一个协作性的工作：项目各部分很可能分别是不同人完成的，有了接口大家就能分头开干，都按照接口来办事，各自做完就能轻松地整合到一起,而且各部分的测试也更加方便。

**21.内部类**
内部类就是定义在别的类内部或函数内部的类(定义时常常需要override),内部类能直接访问父类或父函数的全部资源。包括任何私有的成员,当外部是函数时，只能访问那个函数里final的变量

**22.匿名类**
在new对象的时候给出的类的定义形成了匿名类(定义时常常需要override),匿名类可以继承某类，也可以实现某接口
Swing的消息机制广泛使用匿名类,因为当swing部件太多时,为每一个部件其名字很繁琐,

```java
btnStep.addActionListener(new ActionListener(){
//ActionListener是一个接口,用new ActionListener()定义了一个类,但是没有名字
	@override
	public void actionPerformed(ActionEvent e) {
		System.out.println("按下啦!");
		step();
		frame.repaint();
		}
	});
```
**23.JTable**

import javax.swing.JTable
JTable格式与数据分离,数据存储在新建文件(例如KCBData.java)中
eclipse: 点击新建类->命名为KCBData,在接口栏点击添加TableModel,然后自动生成
IDEA:新建类,implements TableModel,然后按住alt+enter纠错,此时会添加引用包import javax.swing.table.TableModel;,然后在报错的public class XXX implements TableModel 中再按住alt+enter纠错,选择实现方法,选中所有方法即可

**24.异常**

子类继承父类的时候,所有抛出的异常必须都被父类包含
如果父类的构造函数extends了异常,那么子类的构造函数必须包含所有父类构造函数的异常


