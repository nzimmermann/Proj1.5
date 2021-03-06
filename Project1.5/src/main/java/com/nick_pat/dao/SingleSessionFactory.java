package com.nick_pat.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public enum SingleSessionFactory {
    INSTANCE;
    SessionFactory factory = new Configuration().configure().buildSessionFactory();

    public SessionFactory getFactory(){
        return factory;
    }
}
