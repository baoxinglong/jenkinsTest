package com.example.demo.s;


import javax.persistence.*;

@Entity

public class Message   {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;



    public Message (){}

    public Message (String name) {
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
