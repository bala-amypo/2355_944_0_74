package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.project.entity.Studententity;
import com.example.project.service.Stdnetservice;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class StudentController {
    @Autowired
    StudnetService src;
    @PostMapping("/post")
    public Studententity postdata(@RequestBody Studententity st){
                return src.savedata(st);
    }
    @GetMapping("/get")
    public List<Studententity> getData(){
        return src.redata();
    }
    @GetMapping("/get/{id}")
    public  Studententity getIdVal(@PathVariable int id){
        return src.id(id);
    }
   
}
    

