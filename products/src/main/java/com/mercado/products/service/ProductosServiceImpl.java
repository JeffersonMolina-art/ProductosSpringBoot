package com.mercado.products.service;

import com.mercado.products.dao.ProductosDao;
import com.mercado.products.entity.Productos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductosServiceImpl implements ProductosService {

    @Autowired
    private ProductosDao productosDao;

    @Override
    public List<Productos> findByAll() {
        return (List<Productos>)productosDao.findAll();
    }

    @Override
    public Productos findById(Long id) {
        return productosDao.findById(id).orElse(null);
    }

    @Override
    public void crearProducto(Productos productos) {
        productosDao.save(productos);
    }

    @Override
    public void modificarProducto(Long id, Productos productos) {
        if(productosDao.existsById(id)){
            productos.setId(id);
            productosDao.save(productos);
        }
    }

    @Override
    public void eliminarPorducto(Long id) {
        if(productosDao.existsById(id)){
            productosDao.deleteById(id);
        }
    }
}
