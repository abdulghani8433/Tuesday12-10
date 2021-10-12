package postgres.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import postgres.model.Department;
import postgres.repository.DepartmentRepository;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	public List<Department> getDepartment() {
		return departmentRepository.findAll();
	}

	public void addNewUser(Department department) {
		 System.out.println(department);
		
	}

	public void deleteDepartment(Long id) {
		 Boolean exists=departmentRepository.existsById(id);
		 if(!exists) {
			 System.out.println("department doesnot exist"+id);
		 }
		 departmentRepository.deleteById(id);
			 
		}



	public List<Department> addDepartment(List<Department> department) {
		return departmentRepository.saveAll(department);
	}

	public Optional<Department> getDepartment(Long id) {
		return departmentRepository.findById(id);
	}

	public void updateDepartment(Department department) {
		departmentRepository.save(department);
	}
}
	

	
	
	
	
	

	
	
	
	
	


