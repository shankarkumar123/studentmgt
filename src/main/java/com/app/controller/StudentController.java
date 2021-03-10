package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.app.model.Student;
import com.app.service.IStudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
    
	@Autowired
	private IStudentService service;
	
	@RequestMapping("/reg")
	public String showRegPage(ModelMap map) {
		map.addAttribute("student", new Student());
		return "StudentRegister";
		
	}
	
	//2.insert data
		@RequestMapping(value="/insert",method=RequestMethod.POST)
		public String save(@ModelAttribute Student   student,ModelMap map) {

			
				Integer id = service.saveStudent(student);
				String msg="save with id"+id;

				map.addAttribute("message",msg);

				
				map.addAttribute("student", new Student());
				
			
			return "StudentRegister";

		}

}
