package com.sindhu.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sindhu.entity.Student;

@Repository
public interface StudentRepositry extends JpaRepository<Student, Long>{

	@Query("SELECT s FROM Student s where s.email =?1")
	Optional<Student> findStudentByEmail(String email);
}
