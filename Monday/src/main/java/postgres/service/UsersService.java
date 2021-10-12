package postgres.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import postgres.model.Users;
import postgres.repository.UsersRepository;

@Service
public class UsersService {

	@Autowired
	private UsersRepository usersRepository;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public List<Users> getUsers() {
		return usersRepository.findAll();

	}

	public Users addNewUser(Users users) {
		String encodedPassword = bCryptPasswordEncoder.encode(users.getPassword());
		users.setPassword(encodedPassword);

		return usersRepository.save(users);
	}

	public void deleteUsers(Long id) {
		Boolean exists = usersRepository.existsById(id);
		if (!exists) {
			System.out.println("employee doesnot exist" + id);
		}
		usersRepository.deleteById(id);

	}

	public Optional<Users> getById(Long id) {
		return usersRepository.findById(id);
	}

	public void updateUsers(Users user) throws Exception {
		if (user.getAge() < 18) {

			throw new Exception("Age cannot be less than 18!!");
		}

		usersRepository.save(user);

	}


	public Users Login(Users users) throws Exception {

		Users user = usersRepository.findByUsernam(users.getUsername());
		Boolean flag = bCryptPasswordEncoder.matches(users.getPassword(), user.getPassword());
		if (!flag) {
			throw new Exception("Invalid Credentials");

	}
		return user;
		
	}


}
