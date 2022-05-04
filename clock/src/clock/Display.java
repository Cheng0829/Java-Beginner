package clock;

//public class Display extends super_class{...}
//与python一样,继承后的子类Display拥有原super_class的一切数据和操作,但是如果子类中也有同名的数据或操作,则会使用子类自己的.
public class Display {
	private int value = 0;
	private int limit = 0;//private,只有在Display类里面才能访问
	private static int step = 0;//不同对象的static变量值保持一致 ,调用时可以写作Display.step,而不需要是d.step
	
	//eclipse点击源码->使用字段生成构造函数,即可生成Display(相当于python的init),不必手动构造
	//IDEA:代码->生成->构造函数
	public Display(int value, int limit) {
		//与类同名,相当于python类中的init,this.limit相当于__init__.limit
		super();//可以调用一个父类的没有参数的构造器(即父类的同名函数,相当于python类的init)
		//由于此处Display没有父类.所以可以不加super,
		this.value = value;
		this.limit = limit;
	}

	public void increase() {
		value++;
		if(value==limit)
			value = 0;//归零
	}
	
	public int getValue() {
		return value;
	}
	
	public static void main(String[] args) {
		Display d = new Display(0,24);//24进制
		for(;;) {//无限循环
			d.increase();   
			System.out.println(d.getValue());//最好用getValue而不是d.value,因为value是private,Display类之外不可视
		}
	}
}
