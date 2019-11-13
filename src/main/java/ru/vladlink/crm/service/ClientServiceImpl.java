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
    public void removeClient(int id) {
        this.clientRepository.removeClient(id);
    }

    @Override
    @Transactional
    public void addClient(Client client) {
        this.clientRepository.addClient(client);
    }

    @Override
    @Transactional
    public void updateClient(Client client) {
        this.clientRepository.updateClient(client);
    }

    @Override
    public List<Client> getClientsByAddress() {
        return this.clientRepository.getClientsByAddress();
    }
}
