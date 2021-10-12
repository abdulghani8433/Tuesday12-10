package postgres.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import postgres.model.Employee;
import postgres.model.User_type;
import postgres.service.User_typeService;

@RestController
@RequestMapping("api/user_type")
public class User_typeController {
	
	@Autowired
	public User_typeService user_typeService;
	
	
	@GetMapping
	public List<User_type> getUser_type(){
		return user_typeService.getUser_type();
	}
	
	
	
	 @PostMapping
		public  List<User_type>  addNewUser_type(@RequestBody  List<User_type> user_type) {
			return user_typeService.addNewUser_type(user_type);
			
		}
	 
	 @DeleteMapping(path="{id}")
     public void deleteUser_type(@PathVariable("id")Long id) {
      user_typeService.deleteUser_type(id);	
	}
	 
	 @PutMapping(path = "{id}")
		public void updateUser_type(@RequestBody User_type user_type)  {
		 user_typeService.updateUser_type(user_type);
	
	 }	
	

}
