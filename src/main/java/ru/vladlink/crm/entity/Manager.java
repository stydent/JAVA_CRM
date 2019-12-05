package ru.vladlink.crm.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="managers")
public class Manager {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id", updatable=false, nullable=false)
    public Integer id;

    @Column(name = "fio")
    public String managerFio;

    @Column(name = "phone")
    public String phone;

    @Column(name = "assistant_id", insertable = false, updatable = false)
    public Integer assistant_id;

    @Column(name = "status")
    public Integer status;

    @OneToOne
    @JoinColumn (name="assistant_id")
    private Manager assistant;

    public Manager getAssistant() {
        return assistant;
    }

    public void setAssistant(Manager assistant) {
        this.assistant = assistant;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getManagerFio() {
        return managerFio;
    }

    public void setManagerFio(String managerFio) {
        this.managerFio = managerFio;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getAssistant_id() {
        return assistant_id;
    }

    public void setAssistant_id(Integer assistant_id) {
        this.assistant_id = assistant_id;
    }

}
