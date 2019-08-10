package ru.Eltex.kitosina.MainHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import ru.Eltex.kitosina.ClassUser.Developer;
import ru.Eltex.kitosina.ClassUser.Lang;
import ru.Eltex.kitosina.ClassUser.Manager;
import ru.Eltex.kitosina.ClassUser.Sales;

import java.util.ArrayList;


public class HibernateMain {
    public static void main(String[] args) {
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        SessionFactory sessionFactory = null;
        try {
            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        } catch (Exception e) {
            StandardServiceRegistryBuilder.destroy(registry);
            System.err.println(e.getMessage());
        }
        //Добавление записи
        Session sessionWrite=sessionFactory.openSession();
        sessionWrite.beginTransaction();
        ArrayList<Lang> langs=new ArrayList<>();
        Manager manager=new Manager(1,"Maria","Mari@mail.ru","89095204535");
        Sales s1=new Sales("Computer",manager);
        Sales s2=new Sales("Mouse",manager);
        sessionWrite.save(manager);
        sessionWrite.save(s1);
        sessionWrite.save(s2);
        Manager manager1=new Manager(2,"Oleg","Olega@yadex.ru","89069108345");
        Sales s3=new Sales("Monitor",manager1);
        sessionWrite.save(s3);
        sessionWrite.save(manager1);
        Lang l1=new Lang("C++");
        Lang l2=new Lang("Java");
        Lang l3=new Lang("C#");
        langs.add(l1);
        langs.add(l2);
        Developer developer=new Developer("Mixail","Mixa@gmail.com","89096781201",langs);
        sessionWrite.save(l1);
        sessionWrite.save(l2);
        sessionWrite.save(developer);
        langs.add(l3);
        Developer developer1=new Developer("Dmitry","Dimka@mail.ru","83836240118",langs);
        sessionWrite.save(l3);
        sessionWrite.save(developer1);
        sessionWrite.getTransaction().commit();
        sessionWrite.close();
        //Вывод информации и изменение записи
        Session sessionRemove=sessionFactory.openSession();
        sessionRemove.beginTransaction();
        Developer developerInfo=sessionRemove.get(Developer.class,8);
        System.out.println(developerInfo.getFIO());
        System.out.println(developerInfo.getPhone());
        System.out.println(developerInfo.getEmail());
        developerInfo.setPhone("89095254525");
        sessionRemove.update(developerInfo);
        System.out.println("________________________________________");
        System.out.println(developerInfo.getFIO());
        System.out.println(developerInfo.getPhone());
        System.out.println(developerInfo.getEmail());
        sessionRemove.getTransaction().commit();
        sessionRemove.close();
    }
}
