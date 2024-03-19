package com.example.ResgisterLogin.Repo;

import com.example.ResgisterLogin.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ResgisterLogin.Entity.Fruit;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface FruitRepository extends JpaRepository<Fruit, Long> {
    List<Fruit> findByName(String name);
    List<Fruit> findByCategory(Category category);
}
