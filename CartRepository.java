package com.example.ResgisterLogin.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.ResgisterLogin.Entity.CartItem;


@Repository
public interface CartRepository extends JpaRepository<CartItem, Long> {
}