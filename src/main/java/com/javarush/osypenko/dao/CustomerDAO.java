package com.javarush.osypenko.dao;

import com.javarush.osypenko.movie.Customer;
import org.hibernate.SessionFactory;

public class CustomerDAO extends GenericDAO<Customer> {
    public CustomerDAO(SessionFactory sessionFactory) {
        super(Customer.class, sessionFactory);
    }
}
