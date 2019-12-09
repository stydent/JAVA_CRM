package ru.vladlink.crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
public class ManagerController {


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


    @GetMapping("/managers")
    public String list(Model model) {
        List<Manager> managers = servicesManager.getAll();
        model.addAttribute("managers",managers);
        return "managers";
    }

    @GetMapping("/manager/{id}")
    public String client(@PathVariable("id") int id, Model model){
        Manager manager = servicesManager.getOne(id);
        List<Manager> managers = servicesManager.getAll();
        List<Client> clients = servicesClient.clientByManager(manager);
        model.addAttribute("manager", manager);
        model.addAttribute("managers", managers);
        model.addAttribute("clients", clients);
        model.addAttribute("newF", false);
        return "manager";
    }

    @GetMapping("/managerAdd/")
    public String clientNew(Model model){
        List<Manager> managers = servicesManager.getAll();
        Manager manager = new Manager();
        model.addAttribute("manager", manager);
        model.addAttribute("newF", true);
        model.addAttribute("managers", managers);
        return "manager";
    }

    @PostMapping("/updateManager")
    public String updateManager(@RequestParam Integer managerID, @RequestParam String managerFio, @RequestParam String phone, @RequestParam Integer assistant_id){
        servicesManager.saveManager(managerID, managerFio, phone, assistant_id);
        return "redirect:/managers";
    }

    @PostMapping("/addManager")
    public String addClient(@RequestParam String managerFio, @RequestParam String phone, @RequestParam(defaultValue = "0") Integer assistant_id){
        servicesManager.addManager(managerFio, phone, assistant_id);
        return "redirect:/managers";
    }


    @GetMapping("/removeManager/{id}")
    public String removeManager(@PathVariable("id") int id){
        servicesManager.removeManager(id);
        return "redirect:/managers";
    }

}
