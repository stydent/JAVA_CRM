package ru.vladlink.crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.vladlink.crm.entity.Client;
import ru.vladlink.crm.service.ClientService;

import java.util.List;

@Controller
public class ClientController {
    private ClientService clientService;

    @Autowired
    public void setClientService(ClientService clientService) {
        this.clientService = clientService;
    }


    @GetMapping("/")
    public String listS(Model model) {
        List<Client> clients = clientService.findAll();
        model.addAttribute("clients",clients);
        model.addAttribute("text", "Атрибут из компонента");
        return "index";
    }

}
