package ru.vladlink.crm.service;

import org.springframework.web.bind.annotation.RequestParam;
import ru.vladlink.crm.entity.Manager;

import java.util.List;

public interface ManagerService {
    List<Manager> getAll();
    Manager getOne(int id);
    void saveManager(Integer managerID, String managerFio, String phone, Integer assistant_id);
    void addManager(String managerFio, String phone, Integer assistant_id);
}
