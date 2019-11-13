package ru.vladlink.crm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.vladlink.crm.service.ClientService;


@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@Configuration
@ComponentScan
//@EnableAutoConfiguration
public class CrmApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrmApplication.class, args);
    }

    @Controller
    public static class ClientController {
        private ClientService clientService;

        @Autowired
        public void setClientService(ClientService clientService) {
            this.clientService = clientService;
        }

        /*@RequestMapping(value = "clients", method = RequestMethod.GET)
        public String list(Model model){
            model.addAttribute("clients",new Client());
            model.addAttribute("listClients", this.clientService.listClients());
            return "clients";
        }*/

       /* @GetMapping("/")
        public String list(ModelMap model) {
            return "index";
        }*/

        /*@RequestMapping(value = "/", method = RequestMethod.GET)
        public String list(ModelMap model) {

            return "index";
        }*/
/*
        @GetMapping("/")
        public String list(Model model) {
            return "index";
        }*/

        @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
        public String index(Model model) {

            //model.addAttribute("message", message);

            return "index";
        }

    }
}
