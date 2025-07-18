package com.douglasgm.cardapio.entity;


import com.douglasgm.cardapio.dto.FoodRqDTO;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "foods")
@Entity(name = "foods")
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class FoodEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String image;
    private Integer price;

    public FoodEntity(FoodRqDTO data) {
        this.title = data.title();
        this.image = data.image();
        this.price = data.price();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public Integer getPrice() {
        return price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }


    public FoodEntity() {}

    public FoodEntity(Long id, String title, String image, Integer price) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.price = price;
    }
}
