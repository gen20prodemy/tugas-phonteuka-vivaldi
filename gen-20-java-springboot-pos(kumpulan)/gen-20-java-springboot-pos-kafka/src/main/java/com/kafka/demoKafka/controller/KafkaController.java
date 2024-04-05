package com.kafka.demoKafka.controller;

import com.kafka.demoKafka.config.MessageProducer;
import com.kafka.demoKafka.dto.ProductDTO;
import com.kafka.demoKafka.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/kafka")
public class KafkaController {
    @Autowired
    private MessageProducer messageProducer;

    @Autowired
    private ProductService productService;

    @PostMapping("/send")
    public String sendMessage(@RequestParam("message") String message) {
        messageProducer.sendMessage("tes-topic", message);
        return "Message sent: " + message;
    }

    @PostMapping("/push")
    public String pushFromDatabase() {
        // Ambil data produk dari layanan
        List<ProductDTO> products = productService.findAllProducts();

        // Kirim setiap produk ke Kafka
        for (ProductDTO product : products) {
            System.out.println(product);
            messageProducer.sendMessage("tes-topic", product.toString());
        }

        return "Data produk berhasil dipublikasikan ke Kafka.";
    }
}
