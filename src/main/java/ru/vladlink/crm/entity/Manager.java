package ru.vladlink.crm.entity;

import javax.persistence.*;

@Entity
@Table(name="managers")
public class Manager {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    public Integer managerID;

    public Integer getManagerID() {
        return managerID;
    }

    public void setManagerID(Integer managerID) {
        this.managerID = managerID;
    }

    @Column(name = "fio")
    public String managerFio;

    @Column(name = "phone")
    public String phone;

    @Column(name = "status")
    public Integer status;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @OneToOne(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, optional = false)
    @JoinColumn (name="assistant_id")
    private Manager assistant;

    public Manager getAssistant() {
        return assistant;
    }

    public void setAssistant(Manager assistant) {
        this.assistant = assistant;
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

    public Manager() {
    }
    public Manager(String managerFio, String phone, Manager assistant) {
        this.managerFio = managerFio;
        this.phone = phone;
        this.status = 1;
        this.assistant = assistant;
    }
}
