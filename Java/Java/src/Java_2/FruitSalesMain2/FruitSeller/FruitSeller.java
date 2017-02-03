package Java_2.FruitSalesMain2.FruitSeller;


public class FruitSeller{
	int numOfApple;
	int myMoney;
	final int APPLE_PRICE;
	
	public FruitSeller(int apple,int money,int price){
		this.numOfApple = apple;
		this.myMoney = money;
		this.APPLE_PRICE = price;		
	}
	
	public int saleApple(int money){
		int applesForSell = money/APPLE_PRICE;
		this.numOfApple -= applesForSell;
		this.myMoney += money;
		return applesForSell;
	}
	public void showSaleResult(){
		System.out.println("left apples : " + this.numOfApple);
		System.out.println("left money : " + this.myMoney);
	}
	
}