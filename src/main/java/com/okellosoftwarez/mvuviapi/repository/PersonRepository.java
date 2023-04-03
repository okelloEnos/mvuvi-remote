package com.okellosoftwarez.mvuviapi.repository;

import com.okellosoftwarez.mvuviapi.model.MemberData;
import com.okellosoftwarez.mvuviapi.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
//public interface PersonRepository extends JpaRepository<Person, Long> {
//}

@Repository
public interface PersonRepository extends JpaRepository<MemberData, Long>{

}