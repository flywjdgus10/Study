package Java_1.FruitSalesMain2;


class FruitSeller{
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

class FruitBuyer{
	int myMoney;
	int numOfApple = 0;
	
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



public class FruitSalesMain2 {

	public static void main(String[] args) {
		FruitSeller seller1 = new FruitSeller(30, 0, 1500);
		FruitSeller seller2 = new FruitSeller(20, 0, 1000);		
		
		FruitBuyer buyer = new FruitBuyer(0,10000);
		
		buyer.buyApple(seller1, 4500);
		buyer.buyApple(seller2, 2000);
		
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
	}

}



















