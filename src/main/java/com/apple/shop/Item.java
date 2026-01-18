package com.apple.shop;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.ToString;

@Entity
@ToString
@Getter
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column
    private String title;

    @Column
    private Integer price;

    public void setTitle(String title) {

        this.title = title;
    }

    public void setPrice(Integer price) {
        
        this.price = price;
    }
}
