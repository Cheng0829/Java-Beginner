package ssuper;

public class Father {
	protected int a=0;//protected即只能supper包内的各文件调用,private则只能father自己调用,public无限制
	public int b=9;
	public Father(int a) {
		super();//编译器生成构造函数时自动生成,可以删除
		this.a = a;//相当于python类里的init.a
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}
}