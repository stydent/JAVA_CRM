package ru.vladlink.crm.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="clients")
public class Client {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    public Integer id;

    @Column(name = "fio")
    public String fio;

    @Column(name = "address")
    public String address;

    @Column(name = "manager_id", insertable = false, updatable = false)
    public Integer manager_id;

    @Column(name = "status")
    public Integer status;


    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getFio() {
        return fio;
    }

    public String getAddress() {
        return address;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "manager_id")
    private Manager manager;

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Integer getStatus() {
        return status;
    }


}
