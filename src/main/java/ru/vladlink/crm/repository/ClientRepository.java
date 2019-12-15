package ru.vladlink.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vladlink.crm.entity.Client;
import ru.vladlink.crm.entity.Manager;

import java.util.List;


public interface ClientRepository extends JpaRepository<Client, Integer> {

    //@Query("select c.all, m.all from clients c left join managers m on m.id = client.manager")
    //@Query("SELECT c, m.fio AS mfio FROM Client c left join Manager m on m.id = c.id")
    //@Query("SELECT c,m FROM Client c left join Manager m on m.id = c.manager_id ")
    //@Query("SELECT c FROM Client c")
    //List<Client> getAll();
    List<Client> findClientByStatus(Integer status);
    Client findClientById(Integer id);
    List<Client> findClientByManagerAndStatus(Manager manager, Integer status);

}
