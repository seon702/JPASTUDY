package model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Product {

    @Id @GeneratedValue
    private Long id;
    private String name;
    private int price;
    private int stockAmount;


}
