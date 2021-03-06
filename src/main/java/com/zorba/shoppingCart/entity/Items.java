package com.zorba.shoppingCart.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="items")
@Setter
@Getter

public class Items {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="item_id", updatable = false, nullable = false)
    private Integer itemId;

    @Column(name="item_name")
    private String name;

    @Column(name="item_quantity")
    private Integer quantity;

    @ManyToOne(fetch = FetchType.LAZY)
    private Customer customer;


}
