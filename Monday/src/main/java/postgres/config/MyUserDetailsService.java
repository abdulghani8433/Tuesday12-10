
package postgres.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import postgres.model.Users;
import postgres.repository.UsersRepository;
@Service
public class MyUserDetailsService implements UserDetailsService {
	
	
	@Autowired
	private UsersRepository usersRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Users users=usersRepository.findByUsernam(username);
		if(users==null)
		throw new UsernameNotFoundException("user 404");
		
		
		return new UserPrincipal(users);
	}

}
