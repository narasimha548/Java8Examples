package com.config;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateConfigurationUtil {

	private static SessionFactory sessionFactory = null;
	private static StandardServiceRegistryBuilder builder;

	private HibernateConfigurationUtil() {

	}

	public static synchronized SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			Configuration cfg = new Configuration().configure();
			builder = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties());
			sessionFactory = cfg.buildSessionFactory(builder.build());
		}

		return sessionFactory;
	}

}
