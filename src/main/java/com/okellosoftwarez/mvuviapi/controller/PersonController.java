package com.okellosoftwarez.mvuviapi.controller;
import com.okellosoftwarez.mvuviapi.model.Person;
import com.okellosoftwarez.mvuviapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    // create get all person api
    @GetMapping("/person")
    public List<Person> getAllPerson(){
        return  personRepository.findAll();
    }

    // create a person
    @PostMapping("/person")
    public Person createPerson(@RequestBody Person person){
        return  personRepository.save(person);
    }
}
