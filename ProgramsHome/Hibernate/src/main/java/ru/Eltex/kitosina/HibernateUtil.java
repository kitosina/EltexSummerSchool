package ru.Eltex.kitosina;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.transaction.jta.platform.internal.JtaPlatformInitiator;

public class HibernateUtil extends JtaPlatformInitiator {
    private static SessionFactory sessionFactory=null;

    static {
        Configuration cfg=new Configuration().configure();
        StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder().applySettings(cfg.getProperties());

        sessionFactory=cfg.buildSessionFactory(builder.build());
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
