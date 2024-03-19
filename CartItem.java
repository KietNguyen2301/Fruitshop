package com.example.ResgisterLogin.Entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long productId;
    private int quantity;

    public CartItem() {}

    public CartItem(Long productId, int quantity,Boolean deleted) {
        this.productId = productId;
        this.quantity = quantity;
		this.deleted=deleted;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	@Column(nullable = false)
	private Boolean deleted;

    // Getters and setters
	@ManyToMany
	@JoinTable(
			name = "cart_item_fruit",
			joinColumns = @JoinColumn(name = "cart_item_id"),
			inverseJoinColumns = @JoinColumn(name = "fruit_id")
	)
	private Set<Fruit> fruits;


	public Set<Fruit> getFruits() {
		return fruits;
	}

	public void setFruits(Set<Fruit> fruits) {
		this.fruits = fruits;
	}
	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}
    
}
