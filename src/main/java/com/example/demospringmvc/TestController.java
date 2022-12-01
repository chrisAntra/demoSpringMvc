package com.example.demospringmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//http method: get(no request body) post put/patch delete
//requeset parameter, path variable
//request body(json..)
/*
{
    name:
    id:
}

 */
//header payload
//controller -> service -> repository DAO

@RestController
public class TestController {

    @Autowired
    TestService testService;

    @GetMapping("/hello/{name}")
    public ResponseEntity<String> hello(@PathVariable String name){
        return new ResponseEntity<String>("hello, "+name, HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/student")
    public List<Student> getAll(){
        return testService.getAllStudent();
    }
    //dont follow this, should use post
    @GetMapping("/createstudent")
    public String create(){
        return testService.create();

    }
    @ExceptionHandler
    public ResponseEntity<String> exceptionhandler(){
        return new ResponseEntity<String>("xxx", HttpStatus.BAD_REQUEST);
    }
}
