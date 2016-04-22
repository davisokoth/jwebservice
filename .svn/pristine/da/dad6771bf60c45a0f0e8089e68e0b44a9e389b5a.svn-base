package org.kemsa.kws.data;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.kemsa.kws.annotations.ErpDB;

import com.google.inject.Inject;

public class HCRUDImpl<T> implements HCRUD<T> {

	@ErpDB
	@Inject
	private SessionFactory sessionFactory;

	public void create(T t) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(t);
		tx.commit();
		session.close();
		sessionFactory.close();
	}

	public T retrieveById(Class<T> type, long id) {
		Session session = sessionFactory.openSession();
		String queryString = "from " + type.getSimpleName() + " where "
				+ type.getSimpleName() + "_id = :id";
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery(queryString);
		query.setLong("id", id);
		T obj = (T) query.uniqueResult();
		tx.commit();
		session.close();
		sessionFactory.close();
		return obj;
	}
	
	public List<T> retrieveByOwner(Class<T> type, Long c_bpartner_id) {
		Session session = sessionFactory.openSession();
		String queryString = "from " + type.getSimpleName()+" where c_bpartner_id = :c_bpartner_id";	
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery(queryString);
		query.setLong("c_bpartner_id", c_bpartner_id);
		List<T> objList = (List<T>) query.list();
		tx.commit();
		session.close();
		sessionFactory.close();
		return objList;
	}

	public List<T> retrieveAll(Class<T> type) {
		Session session = sessionFactory.openSession();
		String queryString = "from " + type.getSimpleName();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery(queryString);
		List<T> objList = (List<T>) query.list();
		tx.commit();
		session.close();
		sessionFactory.close();
		return objList;
	}

	public T retrieveByName(Class<T> type, String name) {
		Session session = sessionFactory.openSession();
		String queryString = "from " + type.getSimpleName()
				+ " where name = :name";
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery(queryString);
		query.setString("name", name);
		T obj = (T) query.uniqueResult();
		tx.commit();
		session.close();
		sessionFactory.close();
		return obj;
	}

	public T retrieveByCode(Class<T> type, String code) {
		Session session = sessionFactory.openSession();
		String queryString = "from " + type.getSimpleName()
				+ " where value = :code";
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery(queryString);
		query.setString("code", code);
		T obj = (T) query.uniqueResult();
		tx.commit();
		session.close();
		sessionFactory.close();
		return obj;
	}

	public T retrieveByDocNo(Class<T> type, String documentno) {
		Session session = sessionFactory.openSession();
		String queryString = "from " + type.getSimpleName()
				+ " where documentno = :documentno";
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery(queryString);
		query.setString("documentno", documentno);
		T obj = (T) query.uniqueResult();
		tx.commit();
		session.close();
		sessionFactory.close();
		return obj;
	}

	public T retrieveByExtNo(Class<T> type, String externalno) {
		Session session = sessionFactory.openSession();
		String queryString = "from " + type.getSimpleName()
				+ " where externalno = :externalno";
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery(queryString);
		query.setString("externalno", externalno);
		T obj = (T) query.uniqueResult();
		tx.commit();
		session.close();
		sessionFactory.close();
		return obj;
	}
	
	public List<T> retrieveByOrder(Class<T> type, Long c_order_id) {
		Session session = sessionFactory.openSession();
		String queryString = "from " + type.getSimpleName()+" where c_order_id = :c_order_id";	
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery(queryString);
		query.setLong("c_order_id", c_order_id);
		List<T> objList = (List<T>) query.list();
		tx.commit();
		session.close();
		sessionFactory.close();
		return objList;
	}

	public void delete(T t) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.delete(t);
		tx.commit();
		session.close();
		sessionFactory.close();
	}
}
