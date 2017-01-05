package com.shopping.test;

import java.util.ArrayList;
import java.util.List;

import com.shopping.FruitPurchase;
import com.shopping.PriceCalculation;
import org.junit.Test;
import static org.junit.Assert.*;


public class PriceCalculationTest {

    @Test
    public void testGetShoppingCost() {
         
    	List<FruitPurchase> cart = new ArrayList<FruitPurchase>();
		FruitPurchase bananas = new FruitPurchase("Bananas", 2, 1.5F);
		FruitPurchase orange = new FruitPurchase("Orange", 3.2F, 2.5F);
		cart.add(bananas);
		cart.add(orange);
		
		PriceCalculation priceCal = new PriceCalculation();
		Float totalCost = priceCal.getShoppingCost(cart);
		
        Float expCost = 11.0F;
        
        assertEquals(expCost, totalCost);
    }

}
