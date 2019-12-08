package ru.vladlink.crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.vladlink.crm.entity.Client;
import ru.vladlink.crm.entity.Manager;
import ru.vladlink.crm.service.ClientService;
import ru.vladlink.crm.service.ManagerService;

import java.util.List;

@Controller
public class ClientController {


    ClientService servicesClient;
    ManagerService servicesManager;

    public ManagerService getServicesManager() {
        return servicesManager;
    }

    @Autowired
    public void setServicesManager(ManagerService servicesManager) {
        this.servicesManager = servicesManager;
    }

    @Autowired
    public void setServices(ClientService services) {
        this.servicesClient = services;
    }


    @GetMapping("/")
    public String list(Model model) {
        List<Client> clients = servicesClient.getAll();
        model.addAttribute("clients",clients);
        return "index";
    }

    @GetMapping("/client/{id}")
    public String client(@PathVariable("id") int id, Model model){
        Client client = servicesClient.getOne(id);
        List<Manager> managers = servicesManager.getAll();
        model.addAttribute("client", client);
        model.addAttribute("managers", managers);
        return "client";
    }

    @GetMapping("/clientAdd/")
    public String clientNew(Model model){
        List<Manager> managers = servicesManager.getAll();
        Client client = new Client();
        model.addAttribute("client", client);
        model.addAttribute("newF", true);
        model.addAttribute("managers", managers);
        return "client";
    }

    @GetMapping("/removeClient/{id}")
    public String removeClient(@PathVariable("id") int id){
        servicesClient.removeClient(id);
        return "redirect:/";
    }

    @PostMapping("/updateClient")
    public String updateClient(@RequestParam Integer id, @RequestParam String fio, @RequestParam String address, @RequestParam Integer manager_id){
        servicesClient.saveClient(id, fio, address, manager_id);
        return "redirect:";
    }

    @PostMapping("/addClient")
    public String addClient(@RequestParam String fio, @RequestParam String address, @RequestParam Integer manager_id){
        servicesClient.addClient(fio, address, manager_id);
        return "redirect:/";
    }

}
