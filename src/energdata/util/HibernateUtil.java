/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package energdata.util;

import energdata.model.ActiveContractor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.SessionFactoryObserver;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.cfg.Configuration;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 *
 * @author ALUCK
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory;
    private static final StandardServiceRegistry serviceRegistry;

    static {
        try {
            Configuration config = getConfiguration();
            serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
            config.setSessionFactoryObserver(new SessionFactoryObserver() {
                private static final long serialVersionUID = 1L;

                @Override
                public void sessionFactoryCreated(SessionFactory factory) {
                }

                @Override
                public void sessionFactoryClosed(SessionFactory factory) {
                    StandardServiceRegistryBuilder.destroy(serviceRegistry);
                }
            });
            sessionFactory = config.buildSessionFactory(serviceRegistry);
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session openSession() {
        return sessionFactory.openSession();
    }

    private static Configuration getConfiguration() {
        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(ActiveContractor.class);
        cfg.setProperty("hibernate.connection.driver_class", "org.sqlite.JDBC");
        cfg.setProperty("hibernate.connection.url", "jdbc:sqlite:C:\\Users\\ALUCK\\Documents\\NetBeansProjects/EnergData.db");
        cfg.setProperty("hibernate.connection.username", "");
        cfg.setProperty("hibernate.connection.password", "");
        cfg.setProperty("hibernate.show_sql", "true");
        cfg.setProperty("hibernate.dialect", "com.enigmabridge.hibernate.dialect.SQLiteDialect");
        cfg.setProperty("hibernate.hbm2ddl.auto", "update");
        cfg.setProperty("hibernate.cache.provider_class", "org.hibernate.cache.NoCacheProvider");
        cfg.setProperty("hibernate.current_session_context_class", "thread");

        return cfg;

    }

}
