package ru.vladlink.crm.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.vladlink.crm.controller.ErrorController;
import ru.vladlink.crm.entity.Client;
import ru.vladlink.crm.entity.Manager;
import ru.vladlink.crm.repository.ClientRepository;
import ru.vladlink.crm.repository.ManagerRepository;


import java.util.List;
@Service
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    ClientRepository repositoryClient;

    @Autowired
    ManagerRepository repositoryManager;

    ErrorController errorController;

    public List<Manager> getAll() {
        return repositoryManager.findManagerByStatus(1);
    }

    @Override
    public Manager getOne(int id) {

        Manager manager = repositoryManager.findManagerByManagerID(id);
        if(manager==null) {
            errorController.error();
        }
        return manager;
    }

    @Override
    public void saveManager(Integer managerID, String managerFio, String phone, Integer assistant_id) {
        Manager manager = getOne(managerID);
        manager.setManagerFio(managerFio);
        manager.setPhone(phone);
        manager.setAssistant(repositoryManager.getOne(assistant_id));
        repositoryManager.save(manager);
    }

    @Override
    public void addManager(String managerFio, String phone, Integer assistant_id) {
        Manager manager = new Manager(managerFio, phone, repositoryManager.getOne(assistant_id));
        repositoryManager.save(manager);
    }

    @Override
    public void removeManager(int managerID) {
        Manager manager = getOne(managerID);

        int assistantID = manager.getAssistant().getManagerID();
        if(assistantID!=0){
            List<Client> clients = repositoryClient.findClientByManagerAndStatus(manager,1);
            Manager assistant = getOne(assistantID);
            for(Client client: clients){
                client.setManager(assistant);
                repositoryClient.save(client);
            }
            manager.setStatus(0);
            repositoryManager.save(manager);
        }
        else
            return;

    }
}
