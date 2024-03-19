package com.example.ResgisterLogin.Service;

import com.example.ResgisterLogin.Entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ResgisterLogin.Entity.Fruit;
import com.example.ResgisterLogin.Repo.FruitRepository;

import java.util.List;



@Service
public class FruitService {

    @Autowired
    private FruitRepository fruitRepository;

    public List<Fruit> getAllFruits() {
        List<Fruit> fruits = fruitRepository.findAll();

        return fruits;
    }

    public Fruit getFruitById(Long id) {
        Fruit fruit = fruitRepository.findById(id).orElse(null);

        return fruit;
    }

    public List<Fruit> findFruitByName(String name) {
        List<Fruit> fruits = fruitRepository.findByName(name);

        return fruits;
    }

    public List<Fruit> findFruitByCategory(Category category) {
        List<Fruit> fruits = fruitRepository.findByCategory(category);

        return fruits;
    }
    public Fruit createFruit(Fruit fruit) {
        return fruitRepository.save(fruit);
    }

    public Fruit updateFruit(Long id, Fruit updatedFruit) {
        Fruit existingFruit = fruitRepository.findById(id).orElse(null);
        if (existingFruit != null) {
            existingFruit.setName(updatedFruit.getName());
            existingFruit.setDescription(updatedFruit.getDescription());
            existingFruit.setPrice(updatedFruit.getPrice());
            existingFruit.setUnit(updatedFruit.getUnit());
            existingFruit.setOrigin(updatedFruit.getOrigin()); 
            return fruitRepository.save(existingFruit);
        }
        return null;
    }

    public void deleteFruit(Long id) {
        fruitRepository.deleteById(id);
    }
}
