package org.example.database.dao;

import jakarta.persistence.TypedQuery;
import org.example.database.entity.Order;
import org.example.database.entity.OrderDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class OrderDAO {

    private SessionFactory factory = new Configuration().configure().buildSessionFactory();

    public void createOrder(Order order) {
        Session session = factory.openSession();
        session.getTransaction().begin();
        session.persist(order);
        session.getTransaction().commit();
    }

    public void deleteOrder(Order order) {
        Session session = factory.openSession();
        session.getTransaction().begin();
        session.remove(order);
        session.getTransaction().commit();
    }

    public void updateOrder(Order order) {
        Session session = factory.openSession();
        session.getTransaction().begin();
        session.merge(order);
        session.getTransaction().commit();
    }

    public Order findOrderById(Integer id) {
        Session session = factory.openSession();
        String hqlQuery = "SELECT o FROM Order o WHERE o.id = :orderId";
        TypedQuery<Order> query = session.createQuery(hqlQuery, Order.class);
        query.setParameter("orderId", id);

        try {
            return query.getSingleResult();
        } catch (Exception e) {
            return null;
        } finally {
            session.close();
        }
    }

}


