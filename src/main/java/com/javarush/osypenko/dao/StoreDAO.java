package com.javarush.osypenko.dao;

import com.javarush.osypenko.movie.Store;
import org.hibernate.SessionFactory;

public class StoreDAO extends GenericDAO<Store> {
    public StoreDAO(SessionFactory sessionFactory) {
        super(Store.class, sessionFactory);
    }
}
