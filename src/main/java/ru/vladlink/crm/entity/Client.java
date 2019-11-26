package ru.vladlink.crm.entity;

import javax.persistence.*;

@Entity
@Table(catalog = "", name = "clients", schema = "public")
public class Client {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "fio")
    String fio;

    @Column(name = "address")
    String address;

    @Column(name="manager")
    int manager;

    @Column(name="status")
    int status;

    public Client(String fio, String address, int manager, int status) {
        this.fio = fio;
        this.address = address;
        this.manager = manager;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getManager() {
        return manager;
    }

    public void setManager(int manager) {
        this.manager = manager;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
