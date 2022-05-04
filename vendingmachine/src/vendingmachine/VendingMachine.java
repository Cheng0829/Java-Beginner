package vendingmachine;

public class VendingMachine {//自动售货机
	int price = 89;//当前商品价格
	int balance = 0;//余额
	int total = 0;//总价
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
		vm2.showBalance_Total();//成员变量:vm的balance等变量值的改变与vm2无关
	}

}
