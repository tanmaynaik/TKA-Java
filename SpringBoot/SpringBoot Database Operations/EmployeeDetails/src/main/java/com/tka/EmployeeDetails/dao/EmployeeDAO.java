package com.tka.EmployeeDetails.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;
import org.hibernate.query.criteria.JpaCriteriaQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.EmployeeDetails.entity.EmpEntity;

import jakarta.persistence.criteria.Root;


@Repository
public class EmployeeDAO {
	
	@Autowired
	SessionFactory factory;
	
	public String insertData(EmpEntity e) {
		Session ss = factory.openSession();
		Transaction tt = ss.beginTransaction();
		
		ss.persist(e);
		tt.commit();
		ss.close();
		
		return "Data is inserted";
		
	}
	
	public String deleteData(int empid) {
		Session ss = factory.openSession();
		Transaction tt = ss.beginTransaction();
		
		EmpEntity ee = ss.get(EmpEntity.class, empid);
		ss.remove(ee);
		tt.commit();
		ss.close();
		
		return "Data is Deleted";
	}
	
	public String updateData(EmpEntity e, int empid) {
		Session ss = factory.openSession();
		Transaction tt = ss.beginTransaction();
		
		EmpEntity ee = ss.get(EmpEntity.class, empid);
		ee.setEmpname(e.getEmpname());
		ee.setDept(e.getDept());
		ee.setSal(e.getSal());
		
		ss.merge(ee);
		tt.commit();
		ss.close();
		
		
		return "Data is updated";
	}
	
	public EmpEntity getSingleData(int empid) {
		Session ss = factory.openSession();
		Transaction tt = ss.beginTransaction();
		
		
		EmpEntity e = ss.get(EmpEntity.class, empid);
		tt.commit();
		ss.close();
		return e;
	}

	
	public List<Object> getAllRecord(EmpEntity e) {
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		HibernateCriteriaBuilder hcb = ss.getCriteriaBuilder();
		JpaCriteriaQuery<Object> jcq = hcb.createQuery();
		Root<EmpEntity> root = jcq.from(EmpEntity.class);
		jcq.select(root);
		Query<Object> query = ss.createQuery(jcq);
		List<Object> list = query.getResultList();
		tr.commit();
		ss.close();
		return list;
	}
}
