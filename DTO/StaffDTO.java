package DTO;

public class StaffDTO {

	private int staffID;
	private String username;
	private String password;
	private String fullname;
	private String country;
	private String email;
	private String phone;
	private boolean isAdmin;
	
	public StaffDTO() {
	}

	public StaffDTO(int staffID, String username, String password, String fullname, String country, String email,
			String phone, boolean isAdmin) {
		super();
		this.staffID = staffID;
		this.username = username;
		this.password = password;
		this.fullname = fullname;
		this.country = country;
		this.email = email;
		this.phone = phone;
		this.isAdmin = isAdmin;
	}

	public int getStaffID() {
		return staffID;
	}

	public void setStaffID(int staffID) {
		this.staffID = staffID;
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

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	@Override
	public String toString() {
		return "StaffDTO [staffID=" + staffID + ", username=" + username + ", password=" + password + ", fullname="
				+ fullname + ", country=" + country + ", email=" + email + ", phone=" + phone + ", isAdmin=" + isAdmin
				+ "]";
	}
}
