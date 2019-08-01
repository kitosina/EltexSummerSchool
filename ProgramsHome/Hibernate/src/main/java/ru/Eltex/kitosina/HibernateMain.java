package ru.Eltex.kitosina;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.engine.transaction.jta.platform.internal.JtaPlatformInitiator;
import org.hibernate.engine.transaction.jta.platform.spi.JtaPlatform;


public class HibernateMain extends JtaPlatformInitiator {

    public static void main(String[] args) {
        SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
    }
}
