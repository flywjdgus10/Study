package Java_2.FruitSalesMain2;

import Java_2.FruitSalesMain2.FruitSeller.*;
import Java_2.FruitSalesMain2.FruitBuyer.*;

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



















