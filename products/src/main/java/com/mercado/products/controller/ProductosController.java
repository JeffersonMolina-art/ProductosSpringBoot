package com.mercado.products.controller;

import com.mercado.products.entity.Productos;
import com.mercado.products.service.ProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductosController {
    @Autowired
    ProductosService productosService;

    @GetMapping
    public List<Productos> listarProducto(){
        return productosService.findByAll();
    }
    @GetMapping(value = "/{id}")
    public Productos productoId(@PathVariable Long id){
        return productosService.findById(id);
    }
    @PostMapping()
    public void crearProducto(@RequestBody Productos productos){
        productosService.crearProducto(productos);
    }
    @PutMapping(value = "/{id}")
    public void modificarProducto(@PathVariable Long id, @RequestBody Productos productos){
        productosService.modificarProducto(id,productos);
    }
    @DeleteMapping(value = "/{id}")
    public void eliminarProducto(@PathVariable Long id){
        productosService.eliminarPorducto(id);
    }
}
