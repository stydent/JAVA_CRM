package ru.vladlink.crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
    public String list(Model model) {
        List<Client> notebook = clientService.getClientsByAddress();
        //model.addAttribute("clients",notebook);
        return "index";
    }
/*
    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public String index(Model model) {

        //model.addAttribute("message", message);

        return "index";
    }*/

}
