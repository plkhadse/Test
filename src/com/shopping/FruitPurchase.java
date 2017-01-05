package com.shopping;

public class FruitPurchase {

	       String fruitName;
		   float fruitWeight;
		   int fruitUnit;
		   float fruitRate;
		   float fruitCost;
		   
		   public FruitPurchase ( String fruitName, float fruitWeight, float fruitRate){  
			   this.fruitName = fruitName;
			   this.fruitWeight = fruitWeight ;
			   this.fruitRate = fruitRate;
			  
		   }
		   
		   public FruitPurchase ( String fruitName, int fruitUnit, float fruitRate){  
			   this.fruitName = fruitName;
			   this.fruitUnit = fruitUnit;
			   this.fruitRate = fruitRate;
		   }
	   
		   
		 
		/**
		 * @return the fruitName
		 */
		public String getFruitName() {
			return fruitName;
		}
		/**
		 * @param fruitName the fruitName to set
		 */
		public void setFruitName(String fruitName) {
			this.fruitName = fruitName;
		}
		/**
		 * @return the fruitWeight
		 */
		public float getFruitWeight() {
			return fruitWeight;
		}
		/**
		 * @param fruitWeight the fruitWeight to set
		 */
		public void setFruitWeight(float fruitWeight) {
			this.fruitWeight = fruitWeight;
		}

		/**
		 * @return the fruitUnit
		 */
		public int getFruitUnit() {
			return fruitUnit;
		}
		/**
		 * @param fruitUnit the fruitUnit to set
		 */
		public void setFruitUnit(int fruitUnit) {
			this.fruitUnit = fruitUnit;
		}

		/**
		 * @return the fruitRate
		 */
		public float getFruitRate() {
			return fruitRate;
		}

		/**
		 * @param fruitRate the fruitRate to set
		 */
		public void setFruitRate(float fruitRate) {
			this.fruitRate = fruitRate;
		}

		/**
		 * @return the fruitCost
		 */
		public float getFruitCost() {
			if(fruitName.equalsIgnoreCase("Bananas") || fruitName.equalsIgnoreCase("Lemon")){
				fruitCost = fruitUnit * fruitRate;
			}else{
				fruitCost = fruitWeight * fruitRate;
			}
			return fruitCost;
		}

		/**
		 * @param fruitCost the fruitCost to set
		 */
		public void setFruitCost(float fruitCost) {
			this.fruitCost = fruitCost;
		}

		 
		 
	}

