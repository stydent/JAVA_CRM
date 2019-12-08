package ru.vladlink.crm.entity;

import ru.vladlink.crm.repository.ManagerRepository;

import javax.persistence.*;

@Entity
@Table(name="clients")
public class Client {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    public Integer id;

    @Column(name = "fio")
    public String fio;

    @Column(name = "address")
    public String address;

    @Column(name = "status",nullable = false)
    public Integer status;

    @OneToOne (optional=false, cascade=CascadeType.ALL)
    @JoinColumn (name= "manager_id")
    private Manager manager;

    public Client() {
    }
    public Client(String fio, String address, Manager manager) {
        this.fio = fio;
        this.address = address;
        this.status = 1;
        this.manager = manager;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
