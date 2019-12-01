package ru.vladlink.crm.service;

import ru.vladlink.crm.entity.Client;

import java.util.List;

public interface ManagerService {
    List<Client> getAll();
}
