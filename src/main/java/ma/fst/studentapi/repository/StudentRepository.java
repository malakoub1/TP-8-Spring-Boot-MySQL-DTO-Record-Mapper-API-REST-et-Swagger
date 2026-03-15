package ma.fst.studentapi.repository;

import ma.fst.studentapi.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

//gere l entite student avec la cle primaire de type long
public interface StudentRepository extends JpaRepository<Student, Long> {

    //Les methodes save , findAll.... sont heritees de JpaRepository
    Optional<Student> findByEmail(String email);

    boolean existsByEmail(String email);
}