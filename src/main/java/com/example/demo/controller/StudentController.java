package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.project.entity.StudentEntity;
import com.example.project.service.StudentService;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class StudentController {
    @Autowired
    StudentService src;
    @PostMapping("/post")
    public StudentEntity postdata(@RequestBody StudentEntity st){
                return src.savedata(st);
    }
    @GetMapping("/get")
    public List<StudentEntity> getData(){
        return src.redata();
    }
    @GetMapping("/get/{id}")
    public  StudentEntity getIdVal(@PathVariable int id){
        return src.id(id);
    }
    @PutMapping("/update/{id}")
     public String update(@PathVariable Long id, @RequestBody Student newStudent) {

    Optional<Student> student = studentService.getOneStudent(id);

    if (student.isPresent()) {
        newStudent.setId(id);
        studentService.insertStudent(newStudent);
        return "Updated Success";
    }

    return "Id not found";
}
   
}
    

