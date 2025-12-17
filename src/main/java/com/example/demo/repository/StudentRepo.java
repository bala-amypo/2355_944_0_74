package com.example.demo.repository;
import org.springframework.data.jpa.repositoty.JpaRepository;
import org.springframework.stereotype.Respository;
import com.example.demo.entity.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student,Long>{

}
