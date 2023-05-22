package com.okellosoftwarez.mvuviapi.controller;
import com.okellosoftwarez.mvuviapi.model.BiometricData;
import com.okellosoftwarez.mvuviapi.model.MemberData;
import com.okellosoftwarez.mvuviapi.model.Person;
import com.okellosoftwarez.mvuviapi.repository.BiometricRepository;
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

    @Autowired
    private BiometricRepository biometricRepository;

    // create get all person api
    @GetMapping("/person")
    public MemberData retrieveAllPerson() {
        List<MemberData> memberDataList = personRepository.findAll();
        List<MemberData> retrieveMembers = new ArrayList<MemberData>();

        for (MemberData member : memberDataList) {
            MemberData memberData = new MemberData();
            memberData.setIdnumber(member.getIdnumber());
            memberData.setFirstname(member.getFirstname());
            memberData.setId(member.getId());
            memberData.setBmu(member.getBmu());
            memberData.setBirth_date(member.getBirth_date());
            memberData.setFullnames(member.getFullnames());
            memberData.setCard_id(member.getCard_id());
            List<BiometricData> bios = new ArrayList<BiometricData>();
            for (BiometricData biometricData :
                    member.getBiometric_template()) {
                BiometricData data = new BiometricData(biometricData.getName(), biometricData.getTemplate(), biometricData.getLength());
                bios.add(data);
            }

            memberData.setBiometric_template(bios);

            retrieveMembers.add(memberData);
        }
        if (retrieveMembers.isEmpty()) {
return new MemberData();
        } else {
            return retrieveMembers.get(0);
        }
    }

    // create a person
    @PostMapping("/person")
    public MemberData createPerson(@RequestBody MemberData person){
        MemberData memberData = new MemberData();
        List<BiometricData> bios = new ArrayList<BiometricData>();

        for (BiometricData biometricData :
                person.getBiometric_template()) {
            BiometricData data = new BiometricData(biometricData.getName(), biometricData.getTemplate(), biometricData.getLength());
            bios.add(data);
            memberData.getBiometric_template().add(data);
        }


        memberData.setIdnumber(person.getIdnumber());
        memberData.setFirstname(person.getFirstname());
        memberData.setId(person.getId());
        memberData.setBmu(person.getBmu());
        memberData.setBirth_date(person.getBirth_date());
        memberData.setFullnames(person.getFullnames());
        memberData.setCard_id(person.getCard_id());

        memberData.getBiometric_template().forEach(user -> user.setMemberData(memberData));
        personRepository.save(memberData);

//        return new MemberData();
        return person;
//        return "User created succesfully";
    }
}
