package com.example.ResgisterLogin.EmployeeController;

import com.example.ResgisterLogin.Dto.CartItemDTO;
import com.example.ResgisterLogin.Entity.CartItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.ResgisterLogin.Dto.AddToCartRequest;
import com.example.ResgisterLogin.Service.CartService;

import java.util.List;

@RestController
public class CartController {
    @Autowired
    private CartService cartService;

    @PostMapping("/add-to-cart")
    public void addToCart(@RequestBody AddToCartRequest request) {
        cartService.addToCart(request.getProductId(), request.getQuantity(),false);
    }
    @GetMapping("/get-cart")
    public List<CartItemDTO> getCart() {
        return cartService.getCart();
    }
    @GetMapping("/get-cart-byid")
    public List<CartItemDTO> getCartByCartId(@RequestParam Long cartId) {
        return cartService.getCartByCartId(cartId);
    }
}