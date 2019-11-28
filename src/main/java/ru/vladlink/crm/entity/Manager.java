package ru.vladlink.crm.entity;

import javax.persistence.*;

@Entity
@Table(name="managers")
public class Manager {
    @Id
    @GeneratedValue
    @Column(name = "id")
    public Integer id;

    @Column(name = "fio")
    public String fio;

    @Column(name = "phone")
    public String phone;

    @Column(name = "assistant")
    public Integer assistant;

}
