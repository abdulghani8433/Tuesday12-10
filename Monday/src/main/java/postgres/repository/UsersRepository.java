package postgres.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import postgres.model.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {

	
@Query("Select u from Users u where u.username = :username")	
Users findByUsernam(String username);
}
