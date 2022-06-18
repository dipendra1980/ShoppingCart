package com.zorba.shoppingCart.repository;

import com.zorba.shoppingCart.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface ShoppingCartRepository extends CrudRepository<Customer,Long> {
}
