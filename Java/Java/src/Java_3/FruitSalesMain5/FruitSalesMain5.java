package Java_3.FruitSalesMain5;
class FruitBuyer{
	private int myMoney;
	private int numOfApple;
	
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


class FruitSeller{
	private int numOfApple;
	private int myMoney;
	private final int APPLE_PRICE;
	
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
public class FruitSalesMain5 {

	public static void main(String[] args) {
		FruitSeller seller = new FruitSeller(30, 0,1500);
		FruitBuyer buyer = new FruitBuyer(0, 10000);
		
		buyer.buyApple(seller, 4500);

		seller.showSaleResult();
		buyer.showBuyResult();
	}

}
