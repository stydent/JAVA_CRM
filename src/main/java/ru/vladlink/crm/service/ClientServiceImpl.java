package ru.vladlink.crm.service;


import ru.vladlink.crm.entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.vladlink.crm.entity.Manager;
import ru.vladlink.crm.repository.ClientRepository;
import ru.vladlink.crm.repository.ManagerRepository;


import java.util.List;
@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientRepository repositoryClient;

    @Autowired
    ManagerRepository repositoryManager;

    public List<Client> getAll() {
        return repositoryClient.findClientByStatus(1);
    }

    public Client getOne(int id) {
        return repositoryClient.findClientById(id);
    }

    public void removeClient(int id){
        Client client = repositoryClient.findClientById(id);
        client.status = 0;
        repositoryClient.save(client);
    }

    public void saveClient(int id, String fio, String address, Integer manager_id){
        Client client = repositoryClient.findClientById(id);
        client.setFio(fio);
        client.setAddress(address);
        client.setManager(repositoryManager.getOne(manager_id));
        repositoryClient.save(client);
    }


    public void addClient(String fio, String address, Integer manager_id) {
        Client client = new Client(fio, address, repositoryManager.getOne(manager_id));
        repositoryClient.save(client);
    }
}
