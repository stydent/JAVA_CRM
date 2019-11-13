package ru.vladlink.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vladlink.crm.entity.Client;

import java.util.List;

public interface ClientRepository{
    public Client getClientById(int id);
    void addClient(Client client);
    public List<Client> listClients();
}
