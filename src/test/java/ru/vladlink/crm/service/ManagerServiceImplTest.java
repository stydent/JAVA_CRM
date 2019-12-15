package ru.vladlink.crm.service;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.vladlink.crm.entity.Manager;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ManagerServiceImplTest{

    @Autowired
    private ManagerService managerService;
    @Test
    void removeManager() {
        Manager manager = managerService.getOne(10);
        if(manager!=null) {
            managerService.removeManager(manager.getManagerID());
            Assert.assertEquals(0,manager.getStatus().longValue());
        }
    }
}