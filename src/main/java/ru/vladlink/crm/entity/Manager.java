package ru.vladlink.crm.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="managers")
public class Manager {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    public Integer id;

    @Column(name = "fio")
    public String managerFio;

    @Column(name = "phone")
    public String phone;

    @Column(name = "assistant_id")
    public Integer assistant_id;

    public String getAssistant(Integer manager){
        if(manager==1) return "1111";
        else return "6666";
    }

    public List<Client> getClient() {
        return client;
    }

    public void setClient(List<Client> client) {
        this.client = client;
    }

    @OneToMany(
            mappedBy = "manager",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Client> client;

    public List<Client> getClients() {
        return client;
    }

    public void setClients(List<Client> clients) {
        this.client = clients;
    }
/*@OneToMany(mappedBy="manager")
    private List<Client> client;*/

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
