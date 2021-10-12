package postgres.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import postgres.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
