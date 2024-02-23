package DTO;

public class DiscountDTO {
	private int discountID;
	private String discountCode;
	private String description;
	private double price;
	
	public DiscountDTO() {
	}
	
	public DiscountDTO(int discountID, String discountCode, String description, double price) {
		super();
		this.discountID = discountID;
		this.discountCode = discountCode;
		this.description = description;
		this.price = price;
	}
	
	public int getDiscountID() {
		return discountID;
	}
	
	public void setDiscountID(int discountID) {
		this.discountID = discountID;
	}
	
	public String getDiscountCode() {
		return discountCode;
	}
	
	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "DiscountDTO [discountID=" + discountID + ", discountCode=" + discountCode + ", description="
				+ description + ", price=" + price + "]";
	}
}
