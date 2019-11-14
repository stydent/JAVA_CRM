package ru.vladlink.crm.service;

import ru.vladlink.crm.entity.Client;

import java.util.List;

public interface ClientService {
    Client getClientById(int id);
    void removeClient(int id);
    void addClient(Client client);
    void updateClient(Client client);
    List<Client> findAll();
}
