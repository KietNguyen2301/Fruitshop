package com.example.ResgisterLogin.Dto;

import jakarta.persistence.Column;

public class AddToCartRequest {
	private Long productId;
    private int quantity;

	private Boolean deleted;public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
    
    


}
