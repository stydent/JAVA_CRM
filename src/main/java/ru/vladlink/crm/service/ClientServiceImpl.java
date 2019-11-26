package ru.vladlink.crm.service;


import ru.vladlink.crm.entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.vladlink.crm.repository.ClientRepository;


import java.util.List;
@Service
public class ClientServiceImpl implements ClientService {


    @Autowired(required=true)
    private ClientRepository repository;


    public void setClientRepository(ClientRepository repository) {
        this.repository = repository;
    }


    @Override
    public List<Client> findAll() {
        return repository.findAll();
    }
}
