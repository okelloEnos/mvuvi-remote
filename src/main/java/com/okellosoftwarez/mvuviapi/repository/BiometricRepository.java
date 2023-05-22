package com.okellosoftwarez.mvuviapi.repository;

import com.okellosoftwarez.mvuviapi.model.BiometricData;
import com.okellosoftwarez.mvuviapi.model.MemberData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BiometricRepository extends JpaRepository<BiometricData, Long>{

    BiometricData findById(long id);

}