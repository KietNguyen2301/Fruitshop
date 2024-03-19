package com.example.ResgisterLogin.Service;

import com.example.ResgisterLogin.Dto.CartItemDTO;
import com.example.ResgisterLogin.Entity.Fruit;
import com.example.ResgisterLogin.Repo.FruitRepository;
import org.eclipse.angus.mail.imap.protocol.FetchResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ResgisterLogin.Entity.CartItem;
import com.example.ResgisterLogin.Repo.CartRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class CartService {
    @Autowired
    private CartRepository cartRepository;
    @Autowired
    private FruitRepository fruitRepository;

    public void addToCart(Long productId, int quantity,boolean deleted) {
        CartItem cartItem = new CartItem(productId, quantity,false);
        cartRepository.save(cartItem);
    }
    public void deleteCart() {
        List<CartItem> cartItems = cartRepository.findAll();
        for (CartItem cartItem : cartItems) {
            cartItem.setDeleted(true);
            cartRepository.save(cartItem);
        }
    }
    public List<CartItemDTO> getCart() {
        List<CartItemDTO> cartItemsWithFruitInfo = new ArrayList<>();

        List<CartItem> cartItems = cartRepository.findAll();
        for (CartItem cartItem : cartItems) {
            Fruit fruit = fruitRepository.findById(cartItem.getProductId()).orElse(null);
            if (fruit != null) {
                CartItemDTO cartItemDTO = new CartItemDTO();
                cartItemDTO.setProductId(cartItem.getProductId());
                cartItemDTO.setQuantity(cartItem.getQuantity());
                cartItemDTO.setName(fruit.getName());
                cartItemDTO.setPrice(fruit.getPrice());
                cartItemDTO.setDescription(fruit.getDescription());
                cartItemDTO.setUnit(fruit.getUnit());
                cartItemDTO.setOrigin(fruit.getOrigin());
                cartItemDTO.setDeleted(cartItem.getDeleted());
                cartItemsWithFruitInfo.add(cartItemDTO);
            }
        }

        return cartItemsWithFruitInfo;
    }
    public List<CartItemDTO> getCartByCartId(Long cartId) {
        List<CartItemDTO> cartItemsWithFruitInfo = new ArrayList<>();

        Optional<CartItem> cartItemOptional = cartRepository.findById(cartId);
        if (cartItemOptional.isPresent()) {
            CartItem cartItem = cartItemOptional.get();
            Fruit fruit = fruitRepository.findById(cartItem.getProductId()).orElse(null);
            if (fruit != null) {
                CartItemDTO cartItemDTO = new CartItemDTO();
                cartItemDTO.setProductId(cartItem.getProductId());
                cartItemDTO.setQuantity(cartItem.getQuantity());
                cartItemDTO.setName(fruit.getName());
                cartItemDTO.setPrice(fruit.getPrice());
                cartItemDTO.setDescription(fruit.getDescription());
                cartItemDTO.setUnit(fruit.getUnit());
                cartItemDTO.setOrigin(fruit.getOrigin());
                cartItemsWithFruitInfo.add(cartItemDTO);
            }
        }

        return cartItemsWithFruitInfo;
    }
}