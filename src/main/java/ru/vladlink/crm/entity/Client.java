package ru.vladlink.crm.entity;

import javax.persistence.*;

@Entity
@Table(name="clients")
public class Client {
    @Id
    @GeneratedValue
    @Column(name = "id")
    public Integer id;

    @Column(name = "fio")
    public String fio;

    @Column(name = "address")
    public String address;

    @Column(name = "manager")
    public Integer manager;

    @Column(name = "status")
    public Integer status;
}
