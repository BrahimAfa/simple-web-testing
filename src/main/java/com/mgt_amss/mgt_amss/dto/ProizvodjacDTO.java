package com.mgt_amss.mgt_amss.dto;

import javax.persistence.*;

@Entity
@Table(name = "proizvodjac")
public class ProizvodjacDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private int id;
    @Column
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
