package com.okellosoftwarez.mvuviapi.controller;
import com.okellosoftwarez.mvuviapi.model.BiometricData;
import com.okellosoftwarez.mvuviapi.model.MemberData;
import com.okellosoftwarez.mvuviapi.model.Person;
import com.okellosoftwarez.mvuviapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    // create get all person api
    @GetMapping("/person")
    public List<MemberData> getAllPerson(){
        List<MemberData> memberDataList = personRepository.findAll();
        return  memberDataList;
    }

    // create a person
    @PostMapping("/person")
    public MemberData createPerson(@RequestBody MemberData person){

        return  personRepository.save(person);
    }
}
