package ru.vladlink.crm.service;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import ru.vladlink.crm.controller.ClientController;
import ru.vladlink.crm.controller.ErrorController;
import ru.vladlink.crm.entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.vladlink.crm.entity.Manager;
import ru.vladlink.crm.repository.ClientRepository;
import ru.vladlink.crm.repository.ManagerRepository;

import java.util.Optional;


import java.util.List;
@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientRepository repositoryClient;

    @Autowired
    ManagerRepository repositoryManager;

    ErrorController errorController;

    public List<Client> getAll() {
        return repositoryClient.findClientByStatus(1);
    }

    public Client getOne(int id) {

        Client client = repositoryClient.findClientById(id);
        if(client==null) {
            errorController.error();
        }
        return client;

    }

    public void removeClient(int id){
        Client client = getOne(id);
        client.status = 0;
        repositoryClient.save(client);
    }

    public void saveClient(int id, String fio, String address, Integer manager_id){
        Client client = getOne(id);
        client.setFio(fio);
        client.setAddress(address);
        client.setManager(repositoryManager.getOne(manager_id));
        repositoryClient.save(client);
    }


    public void addClient(String fio, String address, Integer manager_id) {
        Client client = new Client(fio, address, repositoryManager.getOne(manager_id));
        repositoryClient.save(client);
    }

    @Override
    public List<Client> clientByManager(Manager manager) {
        List<Client> clients = repositoryClient.findClientByManagerAndStatus(manager,1);
        return clients;
    }
}