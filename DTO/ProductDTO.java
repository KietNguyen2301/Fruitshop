package DTO;

public class ProductDTO {
	private int productID;
	private String productName;
	private String category;
	private String description;
	private double price;
	private int unit;
	private String origin;
	
	public ProductDTO() {
	}

	public ProductDTO(int productID, String productName, String category, String description, double price, int unit,
			String origin) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.category = category;
		this.description = description;
		this.price = price;
		this.unit = unit;
		this.origin = origin;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
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

	public int getUnit() {
		return unit;
	}

	public void setUnit(int unit) {
		this.unit = unit;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	@Override
	public String toString() {
		return "ProductDTO [productID=" + productID + ", productName=" + productName + ", category=" + category
				+ ", description=" + description + ", price=" + price + ", unit=" + unit + ", origin=" + origin + "]";
	}
}
