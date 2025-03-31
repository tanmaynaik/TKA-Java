package com.tka.StudentDetails.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.StudentDetails.entity.Student;

@Repository
public class StdDAO {
	@Autowired
	SessionFactory factory;

	public String insertData(Student s) {

		Session ss = factory.openSession();
		Transaction tt = ss.beginTransaction();
		
		String hqlQuery = "insert into student(sname, course, city) values(:sname, :course, :city)";
		
		MutationQuery query = ss.createNativeMutationQuery(hqlQuery);
		query.setParameter("sname", s.getSname());
		query.setParameter("course", s.getCourse());
		query.setParameter("city", s.getCity());
		query.executeUpdate();
		
		tt.commit();
		ss.close();
		
		return "Data is inserted";
	}
	
	public String deleteData(int rollno) {
		
		Session ss = factory.openSession();
		Transaction tt = ss.beginTransaction();
		
		String hqlQuery = "delete from Student where rollno=:rollno";
		
		MutationQuery query = ss.createMutationQuery(hqlQuery);
		query.setParameter("rollno", rollno);
		query.executeUpdate();
		
		tt.commit();
		ss.close();
		
		
		return "Data is deleted";
	}
	
	public String updateData(Student s, int rollno) {
		Session ss = factory.openSession();
		Transaction tt = ss.beginTransaction();
		
		String hqlQuery = "update Student set sname=:sname, course=:course where rollno=:rollno";
		
		MutationQuery query = ss.createMutationQuery(hqlQuery);
		
		query.setParameter("sname", s.getSname());
		query.setParameter("course", s.getCourse());
		query.setParameter("rollno", rollno);
		
		query.executeUpdate();
		
		tt.commit();
		ss.close();
		
		return "Data is updated";
	}
	
	public Student getSingleData(int rollno) {
		
		Session ss = factory.openSession();
		Transaction tt = ss.beginTransaction();
		
		String hqlQuery = "from Student where rollno=:rollno";
		Query<Student> query = ss.createQuery(hqlQuery, Student.class);
		query.setParameter("rollno", rollno);
		Student s = query.getSingleResult();
		System.out.println(s);
		
		tt.commit();
		ss.close();
		
		return s;
	}
	
	public List<Student> getAllRecord(Student s) {
		
		Session ss = factory.openSession();
		Transaction tt = ss.beginTransaction();
		
		String hqlQuery = "from Student";

		Query<Student> query = ss.createQuery(hqlQuery, Student.class);
		List<Student> list = query.list();
		tt.commit();
		ss.close();
		return list;
	}
}
