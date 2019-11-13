package ru.vladlink.crm.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import ru.vladlink.crm.entity.Client;

import java.util.List;

@Repository
public class ClientRepositoryImpl implements ClientRepository {

    private SessionFactory sessionFactory;

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
    public void addClient(Client client) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(client);
    }

    @Override
    public List<Client> listClients() {
        Session session = sessionFactory.getCurrentSession();
        List<Client> clientList = session.createQuery("from Clients").list();
        return clientList;
    }
}
