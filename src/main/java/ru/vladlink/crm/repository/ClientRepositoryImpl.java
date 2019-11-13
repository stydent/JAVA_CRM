package ru.vladlink.crm.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import ru.vladlink.crm.entity.Client;

import java.util.List;

@Repository
public class ClientRepositoryImpl{

    /*private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Client getClientById(int id) {
        Session session = sessionFactory.getCurrentSession();
        Client client = (Client) session.load(Client.class, id);
        return client;
    }

    @Override
    public void removeClient(int id) {

    }

    @Override
    public void addClient(Client client) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(client);
    }

    @Override
    public void updateClient(Client client) {

    }

    @Override
    public List<Client> listClients() {
        Session session = sessionFactory.getCurrentSession();
        List<Client> clientList = session.createQuery("select from clients").list();
        return clientList;
    }*/
}
