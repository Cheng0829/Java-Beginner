package shapes;

import java.awt.Graphics;

public abstract class Shape {
	//抽象函数:表达概念而无法实现具体代码的函数
	//抽象类:表达概念而无法构造出实体的类
	//比如画一个圆,直线,可以有明确的代码,但是"画一个形状"是无法直接做到的,而且"画一个形状"包含了画圆和画直线

	public abstract void draw(Graphics g);
	public static void main(String[] args) {
		//Shapes s = new Shape();//报错,抽象类不能产生实例对象
	}
}
//抽象类不能产生实例对象
//抽象类的子类(比如Shapes的子类Line和Circle)必须实现(即覆写)父类中的抽象函数,否则他自己就变成抽象函数