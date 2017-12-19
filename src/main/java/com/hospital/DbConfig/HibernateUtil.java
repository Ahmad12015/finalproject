package com.hospital.DbConfig;



public class HibernateUtil {

    private static final DbConnection sessionFactory;
    
    static {
        try {
            sessionFactory = new DbConnection().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static  DbConnection getSessionFactory() {
        return sessionFactory;
    }
}
