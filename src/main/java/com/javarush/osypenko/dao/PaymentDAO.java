package com.javarush.osypenko.dao;

import com.javarush.osypenko.movie.Payment;
import org.hibernate.SessionFactory;

public class PaymentDAO extends GenericDAO<Payment> {
    public PaymentDAO(SessionFactory sessionFactory) {
        super(Payment.class, sessionFactory);
    }
}
