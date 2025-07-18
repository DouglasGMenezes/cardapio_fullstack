package com.douglasgm.cardapio.controller;

import com.douglasgm.cardapio.dto.FoodDTO;
import com.douglasgm.cardapio.dto.FoodRqDTO;
import com.douglasgm.cardapio.entity.FoodEntity;
import com.douglasgm.cardapio.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {

    @Autowired
    private FoodRepository foodRepository;

    @CrossOrigin(origins = "*" , allowedHeaders = "*")
    @GetMapping
    public List<FoodDTO> getAll() {
        List<FoodDTO> foodList = foodRepository.findAll().stream().map(FoodDTO::new).toList();
        return foodList;
    };

    @CrossOrigin(origins = "*" , allowedHeaders = "*")
    @PostMapping("/save")
    public void saveFood(@RequestBody FoodRqDTO data){
        FoodEntity food = new FoodEntity(data);
        foodRepository.save(food);
        return;
    }
}
