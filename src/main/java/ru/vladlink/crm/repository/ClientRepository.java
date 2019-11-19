package ru.vladlink.crm.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import ru.vladlink.crm.entity.Client;

import java.util.List;

@Repository
public interface ClientRepository{

    List<Client> findAll();
}
