package ru.vladlink.crm.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="clients")
public class Client {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id", updatable=false, nullable=false)
    public Integer id;

    @Column(name = "fio")
    public String fio;

    @Column(name = "address")
    public String address;

    @Column(name = "manager_id", insertable = false, updatable = false)
    public Integer manager_id;

    @Column(name = "status",nullable = false)
    public Integer status;

    @OneToOne (optional=false, cascade=CascadeType.ALL)
    @JoinColumn (name="manager_id")
    private Manager manager;

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

    public Integer getManager_id() {
        return manager_id;
    }

    public void setManager_id(Integer manager_id) {
        this.manager_id = manager_id;
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
