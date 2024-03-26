package com.servlet.hello.service;

import com.servlet.hello.entity.ProductEntity;
import com.servlet.hello.utils.RandomNumber;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private static List<ProductEntity> products = new ArrayList<ProductEntity>(){
        {
            add(new ProductEntity(RandomNumber.getRandom(100, 999), "Mie Instan", "65 gr", 4000.0));
            add(new ProductEntity(RandomNumber.getRandom(100, 999), "Air Mineral", "600 ml", 3500.0));
            add(new ProductEntity(RandomNumber.getRandom(100, 999), "Permen Cokelat", "100 gr", 8500.0));
            add(new ProductEntity(RandomNumber.getRandom(100, 999), "Paracetamol", "20 gr", 2000.0));
            add(new ProductEntity(RandomNumber.getRandom(100, 999), "Es Krim", "130 gr", 13000.0));
        }
    };


    public List<ProductEntity> findAll(){
        return products;
    }

    public void addProduct(ProductEntity productEntity){
        productEntity.setId(RandomNumber.getRandom(100, 999));
        products.add(productEntity);
    }

    public void deleteById(Long id){
        //products.removeIf(productEntity -> productEntity.getId() == id);
        //products.removeIf(products -> products.getId() == id);

        products.removeIf(p -> p.getId().equals(id));
    }

    public Optional<ProductEntity> findById(long id){
        return products.stream().filter(p -> p.getId().equals(id)).findFirst();
    }

    public void updateProduct(ProductEntity productEntity){
        //  ============================================ Karena data statis, cara update sederhana nya delete -> add
        deleteById(productEntity.getId());
        products.add(productEntity);
    }
}
