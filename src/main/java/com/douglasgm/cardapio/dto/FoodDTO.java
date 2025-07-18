package com.douglasgm.cardapio.dto;


import com.douglasgm.cardapio.entity.FoodEntity;

public record FoodDTO(Long id,
                      String title,
                      String image,
                      Integer price)
{

    public FoodDTO(FoodEntity food) {
        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
    }

}
