package ru.vladlink.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.ui.Model;
import ru.vladlink.crm.entity.Client;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client,Long>{
    Client getClientById(int id);
    void removeClient(int id);
    void addClient(Client client);
    void updateClient(Client client);
    List<Client> getClientsByAddress();
}
