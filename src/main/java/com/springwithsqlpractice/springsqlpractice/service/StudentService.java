package com.springwithsqlpractice.springsqlpractice.service;

import com.springwithsqlpractice.springsqlpractice.model.Students;
import com.springwithsqlpractice.springsqlpractice.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;


    public Students saveDetails(Students students){
        return studentRepo.save(students);
    }

    public List<Students> getAllDetails(){
       return studentRepo.findAll();
    }

    public Students getParticularData(Integer n){
        return studentRepo.findById(n).orElse(null);
    }

    public Students updateDetails(Students students){
        Students updateData=studentRepo.findById(students.getId()).orElse(null);
        if(updateData!=null){
            updateData.setName(students.getName());
            updateData.setPlace(students.getPlace());
            return studentRepo.save(updateData);
        }
        return null;
    }

//    public Students deleteData(Integer n) {
//        return studentRepo.deleteById(n).orElse("null");
//    }

//    public Students deleteData(Integer n){
//       return studentRepo.deleteAll();
//    }

}
