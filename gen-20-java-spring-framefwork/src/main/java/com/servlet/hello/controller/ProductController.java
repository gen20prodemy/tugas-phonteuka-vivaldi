package com.servlet.hello.controller;

import com.servlet.hello.entity.ProductEntity;
import com.servlet.hello.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping
    public String HelloWorld (Model model){
        String messeges = "Hello World passing dengan tyhmeleaf";
        model.addAttribute("msg", messeges);
        model.addAttribute("products", productService.findAll());
        return "index";
    }

    @GetMapping("/add")
    public String add(Model model){
        model.addAttribute("productbaru", new ProductEntity());
        return "addProduct";
    }

    @PostMapping("/save")
    public String save(ProductEntity productEntity, Model model){
        productService.addProduct(productEntity);

        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id){
        productService.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, Model model){
        model.addAttribute("productbaru", productService.findById(id));
        return "editProduct";
    }

    @PostMapping("/update")
    public String update(ProductEntity productEntity, Model model){
        productService.updateProduct(productEntity);

        return "redirect:/";
    }

}
