package ru.vladlink.crm.service;


import ru.vladlink.crm.entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.vladlink.crm.repository.ClientRepository;


import java.util.List;
@Service
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    ClientRepository repository;
    @Override
    public List<Client> getAll() {
        return repository.findAll();
    }
}
