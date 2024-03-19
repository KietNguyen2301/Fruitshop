package com.example.ResgisterLogin.EmployeeController;

import com.example.ResgisterLogin.Entity.Category;
import com.example.ResgisterLogin.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.ResgisterLogin.Entity.Fruit;
import com.example.ResgisterLogin.Service.FruitService;

import java.util.List;

@RestController
@RequestMapping("/api/fruits")
public class FruitController {
    @Autowired
    private CategoryService categoryService;

    @Autowired
    private FruitService fruitService;

    @GetMapping
    public List<Fruit> getAllFruits() {
        return fruitService.getAllFruits();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Fruit> getFruitById(@PathVariable Long id) {
        Fruit fruit = fruitService.getFruitById(id);
        return fruit != null ? ResponseEntity.ok(fruit) : ResponseEntity.notFound().build();
    }
    @GetMapping("/findbyname/{name}")
    public List<Fruit> getProductByName(@PathVariable String name) {
        return fruitService.findFruitByName(name);

    }
    @GetMapping("/byCategory/{categoryId}")
    public List<Fruit> getProductsByCategory(@PathVariable Long categoryId) {
        Category category = categoryService.findCategoryById(categoryId);
        if (category != null) {
            return fruitService.findFruitByCategory(category);
        } else {
            return null;
        }

    }
    @PostMapping
    public ResponseEntity<Fruit> createFruit(@RequestBody Fruit fruit) {
        Fruit createdFruit = fruitService.createFruit(fruit);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdFruit);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Fruit> updateFruit(@PathVariable Long id, @RequestBody Fruit updatedFruit) {
        Fruit updated = fruitService.updateFruit(id, updatedFruit);
        return updated != null ? ResponseEntity.ok(updated) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFruit(@PathVariable Long id) {
        fruitService.deleteFruit(id);
        return ResponseEntity.noContent().build();
    }
}
