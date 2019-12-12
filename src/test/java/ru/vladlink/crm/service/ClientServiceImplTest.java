package ru.vladlink.crm.service;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ru.vladlink.crm.entity.Client;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ClientServiceImplTest {

    @Autowired
    private ClientService clientService;
    @Test
    void removeClient() {
        Client client = clientService.getOne(10);
        clientService.removeClient(client.getId());
        Assert.assertEquals("0", client.status.toString());
    }
}