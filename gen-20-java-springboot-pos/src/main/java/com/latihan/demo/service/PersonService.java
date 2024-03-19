package com.latihan.demo.service;
import com.latihan.demo.model.Person;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import java.util.ArrayList;

@Service
public class PersonService {
    /*private Person orang1 = new Person("Agus", 20);
    private Person orang2 = new Person("Budi", 30);
    private Person orang3 = new Person("Budi", 30);

    private List<Person> ListPerson = new ArrayList<>();*/


    private List<Person> ListPerson;

    // Konstruktor untuk inisialisasi default data
    public PersonService() {
        ListPerson = new ArrayList<>();
        ListPerson.add(new Person("Agus", 20));
        ListPerson.add(new Person("Budi", 30));
        ListPerson.add(new Person("Cici", 25));
    }


    public List<Person> printList(){
        return ListPerson;
    }

    public List<Person> addList(String nama, int umur){
        Person tempPerson = new Person(nama, umur);
        ListPerson.add(tempPerson);
        return ListPerson;
    }

    public List<Person> editPerson(int index, String newName, int newAge) {
        if (index >= 0 && index < ListPerson.size()) {
            Person personToUpdate = ListPerson.get(index);
            personToUpdate.setNama(newName);
            personToUpdate.setUmur(newAge);
        }
        return ListPerson;
    }

    public List<Person> deletePerson(int index) {
        if (index >= 0 && index < ListPerson.size()) {
            ListPerson.remove(index);
        }
        return ListPerson;
    }

}
