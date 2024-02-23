package DTO;

public class OrderDTO {
	private int orderID;
	private String date;
	private int customerID;
	private int staffID;
	private int discount;
	private double total;
	private String review;
	
	public OrderDTO() {
	}

	public OrderDTO(int orderID, String date, int customerID, int staffID, int discount, double total, String review) {
		super();
		this.orderID = orderID;
		this.date = date;
		this.customerID = customerID;
		this.staffID = staffID;
		this.discount = discount;
		this.total = total;
		this.review = review;
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public int getStaffID() {
		return staffID;
	}

	public void setStaffID(int staffID) {
		this.staffID = staffID;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	@Override
	public String toString() {
		return "OrderDTO [orderID=" + orderID + ", date=" + date + ", customerID=" + customerID + ", staffID=" + staffID
				+ ", discount=" + discount + ", total=" + total + ", review=" + review + "]";
	}
}
