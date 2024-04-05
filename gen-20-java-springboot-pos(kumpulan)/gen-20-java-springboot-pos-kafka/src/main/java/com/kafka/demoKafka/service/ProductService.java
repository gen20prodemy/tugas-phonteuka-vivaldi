package com.kafka.demoKafka.service;

import com.kafka.demoKafka.dto.ProductDTO;
import com.kafka.demoKafka.entity.ProductEntity;
import com.kafka.demoKafka.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductDTO> findAllProducts() {
        //List<ProductEntity> entities = productRepository.findAll();
        //return entities.stream().map(this::convertToDTO).collect(Collectors.toList());

        List<ProductEntity> entities = productRepository.findAll();
        List<ProductDTO> dtos = new ArrayList<>();

        for (ProductEntity entity : entities) {
            ProductDTO dto = convertToDTO(entity);
            dtos.add(dto);
        }
        return dtos;
    }

    private ProductDTO convertToDTO(ProductEntity entity) {
        return new ProductDTO(
                entity.getId(),
                entity.getName(),
                entity.getQuantity(),
                entity.getPrice(),
                entity.getCategory()
        );
    }
}
