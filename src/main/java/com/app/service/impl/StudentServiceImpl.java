package com.app.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.impl.IStudentDao;
import com.app.model.Student;
import com.app.service.IStudentService;
@Service
public class StudentServiceImpl implements IStudentService {
    
	@Autowired
	private IStudentDao dao;
	@Transactional
	@Override
	public Integer saveStudent(Student stu) {
		// TODO Auto-generated method stub
		return dao.saveStudent(stu);
	}

}
