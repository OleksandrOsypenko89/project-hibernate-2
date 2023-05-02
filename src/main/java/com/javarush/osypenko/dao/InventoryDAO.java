package com.javarush.osypenko.dao;

import com.javarush.osypenko.movie.Inventory;
import org.hibernate.SessionFactory;

public class InventoryDAO extends GenericDAO<Inventory> {
    public InventoryDAO(SessionFactory sessionFactory) {
        super(Inventory.class, sessionFactory);
    }
}
