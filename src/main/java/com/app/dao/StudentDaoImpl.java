package com.app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.impl.IStudentDao;
import com.app.model.Student;
@Repository
public class StudentDaoImpl implements IStudentDao {
   @Autowired	
   private HibernateTemplate ht;	

	@Override
	public Integer saveStudent(Student stu) {
		
		
		
		return  (Integer) ht.save(stu);
	}

}
