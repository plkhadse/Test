package com.shopping;
import java.util.ArrayList;
import java.util.List;

public class PriceCalculation {
	 
	public List<FruitPurchase> doShopping(){
	
		List<FruitPurchase> cart = new ArrayList<FruitPurchase>();
		FruitPurchase bananas = new FruitPurchase("Bananas", 6, 2.25F);
		FruitPurchase orange = new FruitPurchase("Orange", 1.0F, 3.5F);
		FruitPurchase apple = new FruitPurchase("Apple", 1.5F, 7.12F);
		FruitPurchase lemon = new FruitPurchase("Lemon", 3, 1.5F);
		FruitPurchase peaches = new FruitPurchase("Peaches", 2.0F, 2.0F);
		cart.add(bananas);
		cart.add(orange);
		cart.add(apple);
		cart.add(lemon);
		cart.add(peaches);
		
		return cart;
	}
	
	public float getShoppingCost(List<FruitPurchase> purchaseItems ){
		float totalCost = 0.0F; 
			try{ 
				for (FruitPurchase item : purchaseItems) { 		      
					totalCost = totalCost + item.getFruitCost();
			    }
			}catch(Exception ex){
				throw new RuntimeException(ex.getMessage());
			}
		 
		return totalCost;
	}
}
