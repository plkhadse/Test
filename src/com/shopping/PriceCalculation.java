package com.shopping;
import java.util.ArrayList;
import java.util.List;

public class PriceCalculation {
	public static void main(String args[]) { 
		
		PriceCalculation priceCal = new PriceCalculation();
		try{ 
			List<FruitPurchase> purchaseItems = priceCal.doShopping();
			Float totalCost = priceCal.getShoppingCost(purchaseItems);
			System.out.println("Total Payment = "+ totalCost);
		}catch(Exception e){
			System.out.println("Error occured while shopping "+ e);
		}
		
	}
	 
	private List<FruitPurchase> doShopping(){
	
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
		for (FruitPurchase item : purchaseItems) { 		      
			totalCost = totalCost + item.getFruitCost();
	      }
		 
		return totalCost;
	}
}
