package com.mgt_amss.mgt_amss.dto;

import javax.persistence.*;

@Entity
@Table(name = "kvk1")
public class KontrolnikVucneKuke1DTO {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private int id;

    private Boolean poznat;

    private String aP1;
    private String aP2;

    private String bP1;
    private String bP2;

    //AUTO GENERATED


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getPoznat() {
        return poznat;
    }

    public void setPoznat(Boolean poznat) {
        this.poznat = poznat;
    }

    public String getaP1() {
        return aP1;
    }

    public void setaP1(String aP1) {
        this.aP1 = aP1;
    }

    public String getaP2() {
        return aP2;
    }

    public void setaP2(String aP2) {
        this.aP2 = aP2;
    }

    public String getbP1() {
        return bP1;
    }

    public void setbP1(String bP1) {
        this.bP1 = bP1;
    }

    public String getbP2() {
        return bP2;
    }

    public void setbP2(String bP2) {
        this.bP2 = bP2;
    }
}
