package model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "ORDERS")
@Data
public class Order {
    @Id @GeneratedValue
    private Long id;

    private int orderAmount;

    @Embedded
    private Address address;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID")
    private Product product;
}
