package com.okellosoftwarez.mvuviapi.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.*;

@Entity
@JsonSerialize
public class BiometricData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
        @Column(name = "name")
        private String name;

        @Column(name = "template", length = 300000)
        private String template;
        //
        @Column(name = "length")
        private int length;

//    @ManyToOne(fetch = FetchType.LAZY)
    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name="idnumber")
//    @ManyToOne(optional = false, fetch = FetchType.LAZY, cascade =
//            CascadeType.REMOVE)
    private MemberData memberData;
        public BiometricData() {
            super();
        }

        public BiometricData(String name,
                      String template,
                      int length
        ) {
            this.name = name;
            this.template = template;
            this.length = length;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

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
//    }


    public MemberData getMemberData() {
        return memberData;
    }

    public void setMemberData(MemberData memberData) {
        this.memberData = memberData;
    }
}
