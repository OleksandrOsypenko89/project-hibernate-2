package com.javarush.osypenko.dao;

import com.javarush.osypenko.movie.Category;
import org.hibernate.SessionFactory;

public class CategoryDAO extends GenericDAO<Category> {
    public CategoryDAO(SessionFactory sessionFactory) {
        super(Category.class, sessionFactory);
    }
}
