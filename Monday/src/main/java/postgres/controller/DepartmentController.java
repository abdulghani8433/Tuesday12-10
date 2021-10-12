package postgres.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import postgres.model.Department;
import postgres.model.Users;
import postgres.service.DepartmentService;

@RestController
@RequestMapping("api/department")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping
	public List<Department> getDepartments(){
		return departmentService.getDepartment();
	}
	@GetMapping(path="{id}")
	public Optional<Department> getdepartment(@PathVariable("id")Long id){
		return departmentService.getDepartment(id);
	}
	
	@PutMapping(path = "{id}")
	public void updateDepartment(@RequestBody Department department)  {
		departmentService.updateDepartment(department);
	}
	
	
	 @PostMapping
		public List<Department>  addNewDepartment(@RequestBody List<Department> department ) {
			return departmentService.addDepartment(department);
			
		}
	 @DeleteMapping(path="{id}")
     public void deleteDepartment(@PathVariable("id")Long id) {
      departmentService.deleteDepartment(id);	
}
	
}
