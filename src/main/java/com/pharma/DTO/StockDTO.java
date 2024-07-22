package com.pharma.DTO;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;

public class StockDTO {	 

	    @NotEmpty(message = "Drug name is required")
	    private String drugName;
	    private String drugCategory;
	    private String manufacturer;
	    private String manufacturedDate; 
	    private String expiredDate;
	    @Positive(message = "Quantity must be a positive value")
	    private int quantity;
	    @Positive(message = "Price must be a positive value")
	    private int price;
	    private String drugUse; 
	    private String sideEffect;
		public String getDrugName() {
			return drugName;
		}
		public void setDrugName(String drugName) {
			this.drugName = drugName;
		}
		public String getDrugCategory() {
			return drugCategory;
		}
		public void setDrugCategory(String drugCategory) {
			this.drugCategory = drugCategory;
		}
		public String getManufacturer() {
			return manufacturer;
		}
		public void setManufacturer(String manufacturer) {
			this.manufacturer = manufacturer;
		}
		public String getManufacturedDate() {
			return manufacturedDate;
		}
		public void setManufacturedDate(String manufacturedDate) {
			this.manufacturedDate = manufacturedDate;
		}
		public String getExpiredDate() {
			return expiredDate;
		}
		public void setExpiredDate(String expiredDate) {
			this.expiredDate = expiredDate;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public String getDrugUse() {
			return drugUse;
		}
		public void setDrugUse(String drugUse) {
			this.drugUse = drugUse;
		}
		public String getSideEffect() {
			return sideEffect;
		}

		public void setSideEffect(String sideEffect) {
			this.sideEffect = sideEffect;
		}
}