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

    @Override
    public Manager getOne(int id) {
        return repository.findManagerByManagerID(id);
    }

    @Override
    public void saveManager(Integer managerID, String managerFio, String phone, Integer assistant_id) {
        Manager manager = getOne(managerID);
        manager.setManagerFio(managerFio);
        manager.setPhone(phone);
        manager.setAssistant(repository.getOne(assistant_id));
        repository.save(manager);
    }

    @Override
    public void addManager(String managerFio, String phone, Integer assistant_id) {
        Manager manager = new Manager(managerFio, phone, repository.getOne(assistant_id));
        repository.save(manager);
    }
}
