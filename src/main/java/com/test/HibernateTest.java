package com.test;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.app.Streams.model.UserDto;
import com.config.HibernateConfigurationUtil;

public class HibernateTest {

	/*
	 * public static SessionFactory getSessionFactory() { Configuration cfg =
	 * new Configuration().configure(); StandardServiceRegistryBuilder builder =
	 * new StandardServiceRegistryBuilder() .applySettings(cfg.getProperties());
	 * 
	 * SessionFactory sessionFactory = cfg.buildSessionFactory(builder.build());
	 * 
	 * return sessionFactory; }
	 */

	public static void main(String[] args) {

		UserDto dto = new UserDto(101, "ACD", "23", 'M', "HYD");
		UserDto dto1 = new UserDto(104, "PHIL", "33", 'S', "CHN");
		UserDto dto2 = new UserDto(103, "JOHN", "33", 'F', "JPR");

		SessionFactory sessionFactory = HibernateConfigurationUtil.getSessionFactory();
		Session session = sessionFactory.openSession();

		session.beginTransaction();
		//session.save(dto1);
		//session.getTransaction().commit();		
		 List<UserDto>      list = session.createQuery("FROM UserDto").list();
		session.close();
		System.out.println("id is  " + dto1.getUserId());
		System.out.println("Employess  " + list);
		

	}

}
