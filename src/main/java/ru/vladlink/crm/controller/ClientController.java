package ru.vladlink.crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public String list(Model model) {
        //List<Client> clients = clientService.findAll();
        //model.addAttribute("clients",clients);
        model.addAttribute("message","ZZZ");
        model.addAttribute("ZZZ","message");
        return "index";
    }

}
