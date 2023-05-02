package com.javarush.osypenko.dao;

import com.javarush.osypenko.movie.Actor;
import org.hibernate.SessionFactory;

public class ActorDAO extends GenericDAO<Actor> {
    public ActorDAO(SessionFactory sessionFactory) {
        super(Actor.class, sessionFactory);
    }
}
