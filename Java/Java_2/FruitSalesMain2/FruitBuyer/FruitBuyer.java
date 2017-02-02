package Java_2.FruitSalesMain2.FruitBuyer;

import Java_2.FruitSalesMain2.FruitSeller.*;

public class FruitBuyer{
	int myMoney;
	int numOfApple;
	
	public FruitBuyer(int apple,int money){
		this.myMoney = money;
		this.numOfApple = apple;
	}
	public void buyApple(FruitSeller seller,int money){
		this.numOfApple += seller.saleApple(money);
		this.myMoney -= money;
	}
	public void showBuyResult(){
		System.out.println("left apples : " + this.numOfApple);
		System.out.println("left money : " + this.myMoney);
	}
}