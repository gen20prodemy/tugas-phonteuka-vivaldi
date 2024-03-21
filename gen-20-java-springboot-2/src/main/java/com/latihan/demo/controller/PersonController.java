package com.latihan.demo.controller;

import com.latihan.demo.model.Person;
import com.latihan.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class PersonController {
    @Autowired
    PersonService personService;

    @GetMapping("/tes")
    String getHelloWorld(){
        return "Hello World";
    }

    @GetMapping("/print")
    public List<Person> printList(){
        return personService.printList();
    }

    @PostMapping("/addlist")
    public List<Person> addPerson(@RequestParam String nama, @RequestParam int umur){
        return personService.addList(nama, umur);
    }

    @PutMapping("/editlist")
    public List<Person> editPerson(@RequestParam int index, @RequestParam String nama, @RequestParam int umur){
        return personService.editPerson(index, nama, umur);
    }

    @DeleteMapping("/deletelist")
    public List<Person> deletePerson(@RequestParam int index){
        return personService.deletePerson(index);
    }

}
