package ru.vladlink.crm.service;

import org.springframework.data.jpa.repository.Query;
import ru.vladlink.crm.entity.Client;

import java.util.List;

public interface ClientService {

    List<Client> getAll();
    Client getOne(int id);
    void removeClient(int id);
    void saveClient(int id, String fio, String address, int manager_id);
}
