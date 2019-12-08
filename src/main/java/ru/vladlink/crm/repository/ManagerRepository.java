package ru.vladlink.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vladlink.crm.entity.Manager;

import java.util.List;

public interface ManagerRepository extends JpaRepository<Manager, Integer> {
    List<Manager> findManagerByStatus(Integer status);
    Manager findManagerByManagerID(Integer id);
}
