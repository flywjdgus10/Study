package Java_1.FruitSalesMain1;
class FruitSeller{
	int numOfApple = 20;
	int myMoney = 0;
	final int APPLE_PRICE =1000;
	
	public int saleApple(int money) {
		int appleForSell = money/APPLE_PRICE;
		this.myMoney += money;
		this.numOfApple -= appleForSell;
		return appleForSell;
	}
	
	
	public void showSaleResult(){
		System.out.println("left apples " + this.numOfApple);
		System.out.println("left momey " + this.myMoney);
	}
}

class FruitBuyer{
	int myMoney = 5000;
	int numOfApple = 0;
	public void buyApple(FruitSeller seller,int money){
		this.myMoney -= money;
		this.numOfApple += seller.saleApple(money);
	}
	public void showBuyResult(){
		System.out.println("left apples " + this.numOfApple);
		System.out.println("left money " + this.myMoney);
	}
		
}

public class FruitSalesMain1 {

	public static void main(String[] args) {
		FruitSeller seller = new FruitSeller();
		FruitBuyer buyer = new FruitBuyer();
		
		buyer.buyApple(seller, 2000);
		
		seller.showSaleResult();
		buyer.showBuyResult();

	}

}
