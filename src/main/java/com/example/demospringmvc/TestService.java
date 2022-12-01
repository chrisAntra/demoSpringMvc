package com.example.demospringmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    TestRepository testRepository;

    List<Student> getAllStudent() {
        return (List<Student>)testRepository.findAll(); //select *
    }
    String create(){
        testRepository.save(new Student("xxx"));
        return "success";
    }
}
