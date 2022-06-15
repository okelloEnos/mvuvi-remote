package com.okellosoftwarez.mvuviapi.model;

import javax.persistence.*;

@Entity
@Table
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "name")
    private String name;
//    @Column(name = "template", length = 300000)
//    private byte[] template;

    @Column(name = "template", length = 300000)
    private String template;
//
    @Column(name = "length")
    private int length;

    public Person() {
        super();
    }

    public Person(String name,
//                  byte[] template
                  String template,
                  int length
    ) {
        this.name = name;
        this.template = template;
//        this.string_template = string_template;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public byte[] getTemplate() {
//        return template;
//    }
//
//    public void setTemplate(byte[] template) {
//        this.template = template;
//    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public int getLength() {
        return length;
    }
//
    public void setLength(int length) {
        this.length = length;
    }
}
