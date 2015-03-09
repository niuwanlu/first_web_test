package com.sprhib.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import javax.security.auth.login.AppConfigurationEntry;
import javax.security.auth.login.Configuration;
import javax.transaction.Transaction;
import java.io.File;

public class ClassToDB {
    public static void main(String[] args) {
        Configuration config = new Configuration();
        Session session = null;
        Transaction sa = null;

        config.configure("src/hibernate.cfg.xml");
        SessionFactory sessionFactory = config.buildSessionFactory();
        session = sessionFactory.openSession();
        sa = session.beginTransaction();
        SchemaExport schemaExport = new SchemaExport(config);
        schemaExport.create(true, true);
        sa.commit();

    }
}