package ru.vladlink.crm.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.vladlink.crm.entity.Manager;
import ru.vladlink.crm.repository.ManagerRepository;


import java.util.List;
@Service
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    ManagerRepository repository;

    public List<Manager> getAll() {
        return repository.findManagerByStatus(1);
    }
}
