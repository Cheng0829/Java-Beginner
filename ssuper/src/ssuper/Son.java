package ssuper;

public class Son extends Father{
	public String son_title;
	public int b=8;
	public Son(int a, String son_title) {
		super(a);//������superд���̳�a,������ʹ��a,�������super,Ĭ��Ϊ�޲�����super()
		this.a = a;
		this.son_title = son_title;
	}
	public void test(String abc) {
		System.out.printf(son_title);
		System.out.printf("\nSon:%d Father:%d",b,super.b);//ͬ��ʱҪ�ø������ݱ����super.XXX
	}
	public static void main(String[] args) {
		Son tmp = new Son(3,"2");
		Father ttt = new Father(1);
		ttt = tmp;//��������: ���������Ը�ֵ���������,����������ܸ�ֵ���������
		tmp.test("1");
		//Object ab = new Object();
		//ab.�ڶ෽��//�����Զ����඼��Object�������,Ҳ�Ϳ�����object�ĸ��ַ���:
		
		
	}
}