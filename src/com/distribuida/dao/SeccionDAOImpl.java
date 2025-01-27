package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.distribuida.entities.Seccion;

@Repository
public class SeccionDAOImpl implements SeccionDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	
	@Override
	@Transactional
	public List<Seccion> findAll() {

		Session session =sessionFactory.getCurrentSession();
		return session.createQuery("from Seccion",Seccion.class).getResultList();
	}

	
	
	
	@Override
	@Transactional
	public Seccion findOne(int id) {
		//Buscando el primer valor
				Session session = sessionFactory.getCurrentSession();
				return session.get(Seccion.class, id);
	}
	
	
	
	
	

	@Override
	@Transactional
	public void add(Seccion seccion) {
		Session session = sessionFactory.getCurrentSession();
		//ADD 0
		// Cliente cliente = new cliente(0,"1566464","nombre","apellido","direccion","tele","correo");
		session.saveOrUpdate(seccion);

	}
	
	
	
	
	

	@Override
	@Transactional
	public void up(Seccion seccion) {
		Session session = sessionFactory.getCurrentSession();//
		
		session.saveOrUpdate(seccion);

	}
	
	
	
	
	

	@Override
	@Transactional
	public void del(int id) {
		Session session = sessionFactory.getCurrentSession();//
		session.delete(findOne(id));

	}




	@Override
	public List<Seccion> findAll(String busqueda) {
		// TODO Auto-generated method stub
		return null;
	}

}
