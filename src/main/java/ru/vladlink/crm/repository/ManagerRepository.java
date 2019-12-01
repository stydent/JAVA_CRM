package ru.vladlink.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vladlink.crm.entity.Client;

public interface ManagerRepository extends JpaRepository<Client, Integer> {
}
