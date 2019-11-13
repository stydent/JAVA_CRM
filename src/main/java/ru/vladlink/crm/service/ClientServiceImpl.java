package ru.vladlink.crm.service;

import org.springframework.stereotype.Service;
import ru.vladlink.crm.entity.Client;
import ru.vladlink.crm.repository.ClientRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    private ClientRepository clientRepository;

    public void setClientRepository(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    @Transactional
    public Client getClientById(int id) {
        return this.clientRepository.getClientById(id);
    }

    @Override
    @Transactional
    public void addClient(Client client) {
        this.clientRepository.addClient(client);
    }

    @Override
    @Transactional
    public List<Client> listClients() {
        return this.clientRepository.listClients();
    }
}
