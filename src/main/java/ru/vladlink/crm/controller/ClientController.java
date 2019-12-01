package ru.vladlink.crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.vladlink.crm.entity.Client;
import ru.vladlink.crm.service.ClientService;

import java.util.List;

@Controller
public class ClientController {


    ClientService services;
    @Autowired
    public void setServices(ClientService services) {
        this.services = services;
    }


    @GetMapping("/")
    public String list(Model model) {
        List<Client> clients = services.getAllInfo();
        model.addAttribute("clients",clients);
        model.addAttribute("text", "Атрибут из компонента");
        return "index";
    }

}
