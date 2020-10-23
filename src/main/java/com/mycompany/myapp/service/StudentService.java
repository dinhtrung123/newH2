package com.mycompany.myapp.service;

import com.mycompany.myapp.domain.Student;
import com.mycompany.myapp.repository.StudentRepository;
import com.mycompany.myapp.service.dto.StudentDTO;
import com.mycompany.myapp.service.mapper.StudentConverter;
import liquibase.pro.packaged.O;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private StudentConverter studentConverter;

    @Transactional
    public Student insert(StudentDTO studentDTO) {
        Student newEntity = studentConverter.toEntity(studentDTO);
        System.out.printf("enntityyyy" + newEntity);
        return studentRepository.save(newEntity);
    }

    @Transactional
    public Student update(StudentDTO studentDTO) {
        Optional<Student> studentent = studentRepository.findById(studentDTO.getId());
        Optional<Student> newUpdate = studentConverter.toEntity(studentent, studentDTO);
        return studentRepository.save(newUpdate.get());
    }

    @Transactional(readOnly = true)
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<Student> getStudent(Long id)
    {
        return studentRepository.findById(id);
    }

    @Transactional
    public void delete(long[] ids) {
        for (long id : ids
        ) {
            studentRepository.deleteById(id);
        }
    }
    @Transactional
    public void delete(long id) {

            studentRepository.deleteById(id);

    }

}
