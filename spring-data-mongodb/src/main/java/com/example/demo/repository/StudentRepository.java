package com.example.demo.repository;

import com.example.demo.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface StudentRepository extends MongoRepository<Student, String> {
    List<Student> findByName(String name);

    Student findByEmailAndName (String email, String name);

    Student findByNameOrEmail (String name, String email);

    List<Student> findByDepartmentDepartmentName(String deptname);

    List<Student> findBySubjectsSubjectName (String subName);

    List<Student> findByEmailIsLike (String email);

    List<Student> findByNameStartsWith (String name);
}