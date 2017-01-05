package com.shopping.test;

import java.util.List;
import com.shopping.FruitPurchase;
import com.shopping.PriceCalculation;
import org.junit.Test;
import static org.junit.Assert.*;

public class PriceCalculationTest {

    @Test
    public void testGetShoppingCost() {
         
		PriceCalculation priceCal = new PriceCalculation();
		List<FruitPurchase> purchaseItems = priceCal.doShopping();
		 
		Float totalCost = priceCal.getShoppingCost(purchaseItems);
		
        Float expCost = 36.18F;
        
        assertEquals(expCost, totalCost);
    }
    
 

}
