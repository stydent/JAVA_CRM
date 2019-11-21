package ru.vladlink.crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.vladlink.crm.entity.Client;
import ru.vladlink.crm.service.ClientService;

import java.util.List;

@Controller
public class ClientController {

    //@Autowired
    private ClientService service;


    public void setClientService(ClientService service) {
        this.service = service;
    }


    @GetMapping("/")
    public String list(Model model) {
        //List<Client> clients = service.findAll();
        //model.addAttribute("clients",clients);
        model.addAttribute("text", "Атрибут из компонента");
        return "index";
    }

}
