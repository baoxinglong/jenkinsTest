package com.example.demo.p;


import javax.persistence.*;

@Entity

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;



    public User(){}

    public User(String name) {
        this.name = name;

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }



    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


}
