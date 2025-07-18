package com.douglasgm.cardapio.repository;

import com.douglasgm.cardapio.entity.FoodEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<FoodEntity, Long> {
}
