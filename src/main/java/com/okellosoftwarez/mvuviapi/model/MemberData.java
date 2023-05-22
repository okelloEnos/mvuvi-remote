package com.okellosoftwarez.mvuviapi.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@JsonSerialize
public class MemberData {

@OneToMany(mappedBy = "memberData", cascade = CascadeType.ALL)
            List<BiometricData> biometric_template = new ArrayList<>();
            private String birth_date;

            private String bmu;

            private int bmu_verified;

            private String card_id;

            private int card_issued;

            private String county;

            private String firstname;

            private String formatted_dob;

            private String formatted_regdate;

            private String fullnames;

            private String gender;

            private int id;
    @Id
            private String idnumber;
            private String lastname;
            private int member_verified;
            private String memberphoto;
            private String middlename;
            private String photo;
            private String register_date;
            private String register_time;
            private String registration_token;
            private String subcounty;

    public MemberData() {
    }

    public MemberData(List<BiometricData> biometric_template, String birth_date, String bmu, int bmu_verified,
                      String card_id, int card_issued, String county, String firstname, String formatted_dob,
                      String formatted_regdate, String fullnames, String gender, int id, String idnumber, String lastname,
                      int member_verified, String memberphoto, String middlename, String photo, String register_date, String register_time,
                      String registration_token, String subcounty) {
        this.biometric_template = biometric_template;
        this.birth_date = birth_date;
        this.bmu = bmu;
        this.bmu_verified = bmu_verified;
        this.card_id = card_id;
        this.card_issued = card_issued;
        this.county = county;
        this.firstname = firstname;
        this.formatted_dob = formatted_dob;
        this.formatted_regdate = formatted_regdate;
        this.fullnames = fullnames;
        this.gender = gender;
        this.id = id;
        this.idnumber = idnumber;
        this.lastname = lastname;
        this.member_verified = member_verified;
        this.memberphoto = memberphoto;
        this.middlename = middlename;
        this.photo = photo;
        this.register_date = register_date;
        this.register_time = register_time;
        this.registration_token = registration_token;
        this.subcounty = subcounty;
    }

    public List<BiometricData> getBiometric_template() {
        return biometric_template;
    }

    public void setBiometric_template(List<BiometricData> biometric_template) {
        this.biometric_template = biometric_template;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public String getBmu() {
        return bmu;
    }

    public void setBmu(String bmu) {
        this.bmu = bmu;
    }

    public int getBmu_verified() {
        return bmu_verified;
    }

    public void setBmu_verified(int bmu_verified) {
        this.bmu_verified = bmu_verified;
    }

    public String getCard_id() {
        return card_id;
    }

    public void setCard_id(String card_id) {
        this.card_id = card_id;
    }

    public int getCard_issued() {
        return card_issued;
    }

    public void setCard_issued(int card_issued) {
        this.card_issued = card_issued;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getFormatted_dob() {
        return formatted_dob;
    }

    public void setFormatted_dob(String formatted_dob) {
        this.formatted_dob = formatted_dob;
    }

    public String getFormatted_regdate() {
        return formatted_regdate;
    }

    public void setFormatted_regdate(String formatted_regdate) {
        this.formatted_regdate = formatted_regdate;
    }

    public String getFullnames() {
        return fullnames;
    }

    public void setFullnames(String fullnames) {
        this.fullnames = fullnames;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getMember_verified() {
        return member_verified;
    }

    public void setMember_verified(int member_verified) {
        this.member_verified = member_verified;
    }

    public String getMemberphoto() {
        return memberphoto;
    }

    public void setMemberphoto(String memberphoto) {
        this.memberphoto = memberphoto;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getRegister_date() {
        return register_date;
    }

    public void setRegister_date(String register_date) {
        this.register_date = register_date;
    }

    public String getRegister_time() {
        return register_time;
    }

    public void setRegister_time(String register_time) {
        this.register_time = register_time;
    }

    public String getRegistration_token() {
        return registration_token;
    }

    public void setRegistration_token(String registration_token) {
        this.registration_token = registration_token;
    }

    public String getSubcounty() {
        return subcounty;
    }

    public void setSubcounty(String subcounty) {
        this.subcounty = subcounty;
    }


}
