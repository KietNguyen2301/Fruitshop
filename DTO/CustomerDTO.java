package DTO;

public class CustomerDTO {
	private int customerID;
	private String username;
	private String password;
	private String fullname;
	private String country;
	private String email;
	private String phone;
	private int loyaltyPoint;
	
	public CustomerDTO() {}
	
	public CustomerDTO(int customerID, String username, String password, String fullname, String country, String email,
			String phone, int loyaltyPoint) {
		super();
		this.customerID = customerID;
		this.username = username;
		this.password = password;
		this.fullname = fullname;
		this.country = country;
		this.email = email;
		this.phone = phone;
		this.loyaltyPoint = loyaltyPoint;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getLoyaltyPoint() {
		return loyaltyPoint;
	}

	public void setLoyaltyPoint(int loyaltyPoint) {
		this.loyaltyPoint = loyaltyPoint;
	}

	@Override
	public String toString() {
		return "CustomerDTO [customerID=" + customerID + ", username=" + username + ", password=" + password
				+ ", fullname=" + fullname + ", country=" + country + ", email=" + email + ", phone=" + phone
				+ ", loyaltyPoint=" + loyaltyPoint + "]";
	}
}
