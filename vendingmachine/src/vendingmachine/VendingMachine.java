package vendingmachine;

public class VendingMachine {//�Զ��ۻ���
	int price = 89;//��ǰ��Ʒ�۸�
	int balance = 0;//���
	int total = 0;//�ܼ�
	void insertMoney(int amount)
	{
		balance = balance + amount;
	}
	void showBalance_Total()
	{
		System.out.println("balance="+balance);
		System.out.println("total="+total);
	}
	void getFood()
	{
		if(balance>=price)
		{
			System.out.println("Here you are!");
			balance = balance - price;
			total = total + price;
		}
		else
			System.out.println("Sorry, the balance < price!");
	}
	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();
		VendingMachine vm2 = new VendingMachine();
		vm.insertMoney(100);
		vm.showBalance_Total();
		vm.getFood();
		vm2.showBalance_Total();//��Ա����:vm��balance�ȱ���ֵ�ĸı���vm2�޹�
	}

}