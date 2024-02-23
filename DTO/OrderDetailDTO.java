package DTO;

public class OrderDetailDTO {
	private int orderDetailID;
	private int orderID;
	private int productID;
	private int quantity;
	private double price;
	private double totalamount;
	
	public OrderDetailDTO() {
	}

	public OrderDetailDTO(int orderDetailID, int orderID, int productID, int quantity, double price,
			double totalamount) {
		super();
		this.orderDetailID = orderDetailID;
		this.orderID = orderID;
		this.productID = productID;
		this.quantity = quantity;
		this.price = price;
		this.totalamount = totalamount;
	}

	public int getOrderDetailID() {
		return orderDetailID;
	}

	public void setOrderDetailID(int orderDetailID) {
		this.orderDetailID = orderDetailID;
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTotalamount() {
		return totalamount;
	}

	public void setTotalamount(double totalamount) {
		this.totalamount = totalamount;
	}

	@Override
	public String toString() {
		return "OrderDetailDTO [orderDetailID=" + orderDetailID + ", orderID=" + orderID + ", productID=" + productID
				+ ", quantity=" + quantity + ", price=" + price + ", totalamount=" + totalamount + "]";
	}
}
