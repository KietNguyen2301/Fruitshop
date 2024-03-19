package com.example.ResgisterLogin.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Product")
public class Fruit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @Column(nullable = false)
    private String descriptions;

    @Column(nullable = false)
    private double price;

    @Column(nullable = false)
    private String unit;

    @Column(nullable = false)
    private String origin;

    // Constructors
    public Fruit() {
    }

    public Fruit(String name, String descriptions, double price, String unit, String origin,String images,Category category) {
        this.name = name;
        this.descriptions = descriptions;
        this.price = price;
        this.unit = unit;
        this.origin = origin;
        this.images=images;
        this.category=category;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return descriptions;
    }

    public void setDescription(String descriptions) {
        this.descriptions = descriptions;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
    @Column(length = 65535)
    private String images;
    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }
    @ManyToMany(mappedBy = "fruits")
    private Set<CartItem> cartItems;
    public Set<CartItem> getCarts() {
        return cartItems;
    }

    public void setCarts(Set<CartItem> carts) {
        this.cartItems = carts;
    }
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
    // toString method
    @Override
    public String toString() {
        return "Fruit{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + descriptions + '\'' +
                ", price=" + price +
                ", unit='" + unit + '\'' +
                ", origin='" + origin + '\'' +
                '}';
    }
}
