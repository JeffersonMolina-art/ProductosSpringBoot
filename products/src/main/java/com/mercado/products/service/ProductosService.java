package com.mercado.products.service;

import com.mercado.products.entity.Productos;

import java.util.List;

public interface ProductosService {

    public List<Productos> findByAll();
    public Productos findById(Long id);
    public void crearProducto(Productos productos);
    public void modificarProducto(Long id, Productos productos);
    public void eliminarPorducto(Long id);
}
