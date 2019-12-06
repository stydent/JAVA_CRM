package ru.vladlink.crm.service;


import ru.vladlink.crm.entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.vladlink.crm.repository.ClientRepository;


import java.util.List;
@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientRepository repository;

    public List<Client> getAll() {
        return repository.findClientByStatus(1);
    }

    public Client getOne(int id) {
        return repository.findClientById(id);
    }

    public void removeClient(int id){
        Client client = repository.findClientById(id);
        client.status = 0;
        repository.save(client);
    }

    public void saveClient(int id, String fio, String address, int manager_id){
        Client client = repository.findClientById(id);
        client.setFio(fio);
        client.setAddress(address);
        client.setId(manager_id);
        repository.save(client);
    }


    public void addClient(String fio, String address, Integer manager_id) {
        Client client = new Client(fio, address, manager_id);
        /*client.setFio(fio);
        client.setAddress(address);
        client.setManager_id(manager_id);
        client.setStatus(1);*/
        repository.save(client);
    }
}
