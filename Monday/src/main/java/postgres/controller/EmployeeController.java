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
import postgres.model.Employee;
import postgres.service.EmployeeService;

@RestController
@RequestMapping(path= "api/employee")
public class EmployeeController {

	@Autowired
	private  EmployeeService employeeService;
	
	@GetMapping
	public List<Employee> getEmployees(){
		return employeeService.getEmployees();
	}
	
	@PostMapping
	public List<Employee> addNewEmployee(@RequestBody List<Employee>employee) {
		return employeeService.addNewEmployeee(employee);
	}
	
	@DeleteMapping(path="{id}")
    public void deleteEmployee(@PathVariable("id")Long id) {
     employeeService.deleteEmployee(id);	
	
	}
	@GetMapping(path="{id}")
	public Optional<Employee> getById(@PathVariable("id")Long id){
		return employeeService.getById(id);
	}

	@PutMapping(path = "{id}")
	public void updateEmployee(@RequestBody Employee employee)  {
		employeeService.updateEmployee(employee);
	}
	
	
}
	

