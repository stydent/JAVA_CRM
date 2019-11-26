package ru.vladlink.crm.repository;

import org.springframework.stereotype.Repository;
import ru.vladlink.crm.entity.Client;

import java.util.List;


public class ClientRepositoryImpl {

    public List<Client> findAll() {
        return null;
    }


    /*public List<Client> findAll() {
        List<Client> l = new ArrayList<Client>(); 
        l.add(new Client("Фамилия","Адрес",1,2));
        return l;
    }*/
}
