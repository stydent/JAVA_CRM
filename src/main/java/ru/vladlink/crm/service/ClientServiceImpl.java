package ru.vladlink.crm.service;


import ru.vladlink.crm.entity.Client;
import ru.vladlink.crm.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class ClientServiceImpl implements ClientService {


    private ClientRepository repository;


    public void setClientRepository(ClientRepository repository) {
        this.repository = repository;
    }


    @Override
    public List<Client> findAll() {
        return repository.findAll();
    }
}
