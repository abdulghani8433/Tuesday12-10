package postgres.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import postgres.model.User_type;
import postgres.repository.User_typeRepository;

@Service
public class User_typeService {
	
	@Autowired
	private User_typeRepository user_typeRepository;

	public List<User_type> getUser_type() {
		return user_typeRepository.findAll();
	}

	public void addNewUser_type(User_type user_type) {
		 System.out.println(user_type);		
	}

	public void deleteUser_type(Long id) {
		 Boolean exists=user_typeRepository.existsById(id);
		 if(!exists) {
			 System.out.println("user_type doesnot exist"+id);
		 }
		 user_typeRepository.deleteById(id);
			 
		}

	public void updateUser_type(Long id) {
		 Boolean exists=user_typeRepository.existsById(id);
		 if(!exists) {
			 System.out.println("user_type doesnot exist"+id);
		 }
		 System.out.println(id+ "is updated");
			 
		 }

	public  List<User_type> addNewUser_type(@RequestBody   List<User_type> user_type) {
		
	return user_typeRepository.saveAll(user_type);
		
	}

	public void updateUser_type(User_type user_type) {
		user_typeRepository.save(user_type);
	}
	}
		
	
	
	
	

	
	



