package com.Meta.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Meta.entity.Student;
import com.Meta.exception.ResourceNotFoundException;
import com.Meta.repository.Srepo;
import com.Meta.service.Sserv;


@Service
public class StuServimp implements Sserv {

	
	@Autowired
	private Srepo studentrepoSrepo;
	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		
		return studentrepoSrepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Student not found with id: " + id));
		
	}

	@Override
	public List<Student> addStudent(String name, String address, int age, int number, int enrollmentYear) {
		// TODO Auto-generated method stub
		Student st = new Student();
		st.setName(name);
		st.setAddress(address);
		st.setAge(age);
		st.setNumber(number);
		st.setAdmissiondate(enrollmentYear);
		studentrepoSrepo.save(st);
		return studentrepoSrepo.findAll();
	}

	@Override
	public List<Student> updateStudent(Student student) {
		// TODO Auto-generated method stub
		if(!studentrepoSrepo.existsById(student.getStudentId())) {
			throw new ResourceNotFoundException("Student not found with id: " + student.getStudentId());
		}
		studentrepoSrepo.save(student);
		return studentrepoSrepo.findAll();
	}

	@Override
	public List<Student> deleteStudent(int id) {
	
		if(!studentrepoSrepo.existsById(id)) {
			throw new ResourceNotFoundException("Student not found with id: " + id);
		}
		studentrepoSrepo.deleteById(id);
		return studentrepoSrepo.findAll();
	}

}
