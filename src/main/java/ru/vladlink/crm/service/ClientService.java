package ru.vladlink.crm.service;

import ru.vladlink.crm.entity.Client;

import java.util.List;

public interface ClientService {
    public Client getClientById(int id);
    void addClient(Client client);
    public List<Client> listClients();
}
