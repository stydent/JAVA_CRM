package ru.vladlink.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.vladlink.crm.entity.Client;
import ru.vladlink.crm.entity.Manager;

import java.util.List;

public interface ManagerRepository extends JpaRepository<Manager, Integer> {
    List<Manager> findManagerByStatus(Integer status);
}
