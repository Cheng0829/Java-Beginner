package ssuper;

public class Son extends Father{
	public String son_title;
	public int b=8;
	public Son(int a, String son_title) {
		super(a);//必须用super写明继承a,否则不能使用a,如果不加super,默认为无参数的super()
		this.a = a;
		this.son_title = son_title;
	}
	public void test(String abc) {
		System.out.printf(son_title);
		System.out.printf("\nSon:%d Father:%d",b,super.b);//同名时要用父类数据必须加super.XXX
	}
	public static void main(String[] args) {
		Son tmp = new Son(3,"2");
		Father ttt = new Father(1);
		ttt = tmp;//向上造型: 子类对象可以赋值给父类对象,但父类对象不能赋值给子类对象
		tmp.test("1");
		//Object ab = new Object();
		//ab.众多方法//所有自定义类都是Object类的子类,也就可以用object的各种方法:
		
		
	}
}
