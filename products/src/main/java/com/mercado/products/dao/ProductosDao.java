package com.mercado.products.dao;

import com.mercado.products.entity.Productos;
import org.springframework.data.repository.CrudRepository;

public interface ProductosDao extends CrudRepository<Productos, Long> {
}
