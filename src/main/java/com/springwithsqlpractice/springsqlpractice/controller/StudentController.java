package com.springwithsqlpractice.springsqlpractice.controller;

import com.springwithsqlpractice.springsqlpractice.model.Students;
import com.springwithsqlpractice.springsqlpractice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student/details")
public class StudentController {

 @Autowired
    private StudentService studentService;

 @PostMapping
    public Students postDetails(@RequestBody Students students){
     return studentService.saveDetails(students);
 }

 @GetMapping
    public List<Students> getDetails(){
     return studentService.getAllDetails();
 }

// @GetMapping("/api/student/{id}")
//    public Students getParticularDetails(@PathVariable("id") Integer n){
//     return studentService.getParticularData(n);
// }

 @PutMapping
    public Students updateDetails(@RequestBody Students students){
     return studentService.updateDetails(students);
 }

//@DeleteMapping("/api/students/{id}")
//    public Students deleteDetails(@PathVariable("id")Integer n){
//     return studentService.deleteData(n);
//}

}
