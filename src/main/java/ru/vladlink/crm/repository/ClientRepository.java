package ru.vladlink.crm.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vladlink.crm.entity.Client;

import java.util.List;


public interface ClientRepository extends JpaRepository<Client, Integer> {
}
